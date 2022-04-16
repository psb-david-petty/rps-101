#!/use/bin/env python3
#
# rps101.py
#

import os, re, sys, textwrap

# Formats:
javaf = """
/*
 * RPS101.java
 *
 * @author David C. Petty // http://j.mp/psb_david_petty
 */

public class RPS101 {{
    private String name;
    public RPS101(String name) {{ this.name = name; }}

    public static void echo(String message) {{ System.out.printf("%s", message); }}
    public void win() {{ echo(String.format("%s win! ", name)); }}
    public void lose() {{ echo(String.format("%s lose! ", name)); }}
    public void tie() {{ echo(String.format("A tie!")); }}
    public void bad() {{ echo(String.format("Bad move!")); }}

    /** Return random Move101.
     * @return random Move101.
     */
    public Move101 randomMove() {{
        Move101 move = Move101.values()[(int) (Math.random() * Move101.values().length)];
        System.out.printf("%s:%s ", name, move);
        return move;
    }}
 
    /** Call randomMove() for this and competitor then invoke
     * win(), lose(), and tie() appropriately for us.
     * @param competitor RPS101 competitor
     */
    public void move(RPS101 competitor) {{
        Move101 {us} = this.randomMove();
        Move101 {them} = competitor.randomMove();
{switch}
    }}
}}
"""
switchf = """
switch ({us}) {{
{all_cases}
    default:
        bad();
        break;
}}
"""
casef = """
    case {key}:
        switch ({them}) {{
            case {key}:
                tie();
                break;
{win_cases}
                win();
                break;
{lose_cases}
                lose();
                break;
            default:
                bad();
                break;
        }}
        break;
"""
casewf = """
            case {case:11}:   // {key} {msg}
"""
caself = """
            case {case:11}:
"""

def key_in_string(s, key, keys=set()):
    """Find key in s and return one-element list of key."""
    matches = lambda k, w: w == k or w == '(' + k + ')' \
        or any([w == k + s for s in ('S', 'ES', 'ED', "'S", "'",)])

    words, specials, mapping = s.split(' '), ('VIDEO GAME', ), {
        'AIRBORNE': 'AIR',
        'PLANE': 'AIRPLANE',
        'AXED': 'AXE',  # the opposite of beats?
        'SWEETHEART': 'BABY',
        'BLOODSHED': 'BLOOD',
        'SUPERBOWL': 'BOWL',
        'BUTTERFINGERS': 'BUTTER',
        'UNCHAINED': 'CHAIN',
        'CROSSHAIR': 'CROSS',
        'CROSSING': 'CROSS',
        'BIOELECTRICITY': 'ELECTRICITY',
        'GUITARIST': 'GUITAR',
        'HEARTLAND': 'HEART',
        'HOMEROOM': 'HOME',
        'LAWMAN': 'LAW',
        'LAWMEN': 'LAW',
        'MOONLIGHT': 'MOON',
        'MOONSHINE': 'MOON',
        'NOISEMAKER': 'NOISE',
        'NEWSPAPER': 'PAPER',
        'PAPERWORK': 'PAPER',
        'PEACEFUL': 'PEACE',
        'PITFALLS': 'PIT',
        'SCHOOLKIDS': 'SCHOOL',
        'SKYLIGHT': 'SKY',
        'ROBOTICS': 'ROBOT',
    }
    assert all(k in keys for k in mapping.values()), 'some mapping value(s) not in keys'
    # Look for special keys in s first --- no more than one in each case.
    for k in specials:
        if s.find(k) >= 0:
            return [k.replace(' ', '_'), ]
    # Match all keys in s.
    result = [k for w in words for k in keys if matches(k, w)]
    # When more than one key, find last match that exactly matches a key...
    if len(result) > 1:
        return [r for r in words if r in keys][-1:]
    # ...otherwise return single key in keys...
    if len(result) == 1:
        if result[-1] in keys:
            return result[-1:]
    # ...otherwise match all mappings in s --- no more than one in each case.
    result = [mapping[k] for w in words for k in mapping if matches(k, w)]
    return result

def main(args):
    """Parse ./rps-101-full.txt and write out ./RPS101.java."""
    key_regex = re.compile(r'\d+ - (.+)')
    format = lambda s: re.sub(r'#.*', '', s).strip()

    with open('./rps-101-full.txt', 'r') as rps:
        raw = [ format(s) for s in rps.readlines() if format(s) ]

    rps101, keys, parsed = dict(), set(), tuple()
    for s in raw:
        if key_regex.match(s):
            key = key_regex.match(s).groups()[0].replace(' ', '_')
            keys.add(key)
            parsed += (key, )

    if len(keys) == 101:
        print('\n'.join(textwrap.wrap(', '.join(parsed) + ',',
            initial_indent='    ', subsequent_indent='    ',)))
        print('\n'.join(textwrap.wrap(', '.join(sorted(keys)) + ',',
            initial_indent='    ', subsequent_indent='    ',)))

    # Parse either the key, which comes first, or a key in the line.
    for s in raw:
        if key_regex.match(s):
            key = key_regex.match(s).groups()[0].replace(' ', '_')
        else:
            cases = key_in_string(s, key, keys)
            if len(cases) != 1: print('len != 1', s, cases)
            assert len(cases) == 1, f"len({cases}) != 1"
            rps101[key] = rps101.get(key, list()) + [(cases[0], s, ), ]

    # Print rps101
    for k in rps101:
        print(f"{k:11}: {rps101[k]}")

    # Check rps101 for 101 unique sets of losing keys.
    assert(all( len(v) == 50 for k, v in rps101.items() )), 'not all rps101 values of length 50'
    case_sets = set()
    for k, v in rps101.items():
        s = tuple( k for k, l in v )
        if len(s) != 50:
           print(f"len(rps101['{k}']) == len({sorted(set(s))}) == {len(set(s))} != 50 # {sorted(s)}")
        assert s not in case_sets, "{s} in {case_sets}"
        case_sets.add(s)
    assert len(case_sets) == 101, f"{len(case_sets)} unique cases (!= 101)"

    # Format .java file.
    all_cases = ''
    cases = set(rps101.keys())
    for k in sorted(rps101):
        wins = { c for c, m in rps101[k] }
        losses = { c for c in cases if c not in wins } - { k }
        win_cases = ''
        for case, msg in sorted(rps101[k]):
            win_cases += casewf[1: ].format(case=case, key=k, msg=msg)
        lose_cases = ''
        for case in sorted(losses):
            lose_cases += caself[1: ].format(case=case)
        all_cases += casef[1: ].format(key=k, them='them',
                                       win_cases=win_cases[: -1],
                                       lose_cases=lose_cases[: -1])
    switch = switchf[1: ].format(us='us', all_cases=all_cases[: -1])
    java = javaf[1: ].format(us='us', them='them',
                             switch=textwrap.indent(switch, '        ')[: -1])

    with open('./RPS101.java', 'w') as code:
        code.write(java)
    return java

if __name__ == '__main__':
    is_idle, is_pycharm, is_jupyter = (
        'idlelib' in sys.modules,
        int(os.getenv('PYCHARM', 0)),
        '__file__' not in globals()
        )
    if any((is_idle, is_pycharm, is_jupyter, )):
        java = main(['rps101.py', ])
        print(java)
    else:
        main(sys.argv)

# [RPS-101](https://www.umop.com/rps.htm)

To create a Java-based RPS-101 game (as described by David C. Lovelace) using a `switch` statement in `RPS101.java`, the [`rps101.py`](./rps101.py) [Python](https://docs.python.org/3/) script parses all [outcomes](https://www.umop.com/rps101/alloutcomes.htm) text to create a mapping between the 101 keys and the 50 keys that each key beats.

The `Move101` `enum` as parsed from all [outcomes](https://www.umop.com/rps101/alloutcomes.htm) can be declared:

```Java
public enum Move101 {
    DYNAMITE, TORNADO, QUICKSAND, PIT, CHAIN, GUN, LAW, WHIP, SWORD,
    ROCK, DEATH, WALL, SUN, CAMERA, FIRE, CHAINSAW, SCHOOL, SCISSORS,
    POISON, CAGE, AXE, PEACE, COMPUTER, CASTLE, SNAKE, BLOOD,
    PORCUPINE, VULTURE, MONKEY, KING, QUEEN, PRINCE, PRINCESS, POLICE,
    WOMAN, BABY, MAN, HOME, TRAIN, CAR, NOISE, BICYCLE, TREE, TURNIP,
    DUCK, WOLF, CAT, BIRD, FISH, SPIDER, COCKROACH, BRAIN, COMMUNITY,
    CROSS, MONEY, VAMPIRE, SPONGE, CHURCH, BUTTER, BOOK, PAPER, CLOUD,
    AIRPLANE, MOON, GRASS, FILM, TOILET, AIR, PLANET, GUITAR, BOWL,
    CUP, BEER, RAIN, WATER, TV, RAINBOW, UFO, ALIEN, PRAYER, MOUNTAIN,
    SATAN, DRAGON, DIAMOND, PLATINUM, GOLD, DEVIL, FENCE, VIDEO_GAME,
    MATH, ROBOT, HEART, ELECTRICITY, LIGHTNING, MEDUSA, POWER, LASER,
    NUKE, SKY, TANK, HELICOPTER,
}
```

The [`rps101.py`](./rps101.py) parsing rules for parsing losing cases from all [outcomes](https://www.umop.com/rps101/alloutcomes.htm) are:

- Look for special keys &mdash; no more than one per line &mdash; of which there is only one: `VIDEO GAME` &rarr; `VIDEO_GAME`; otherwise
- When more than one key matches in a line (is an exact match, is in parentheses, or matches with one of several plural, posessive, or participle suffixes), find last match that exactly matches a key; otherwise
- When one key matches in a line, find an exact match; otherwise
- Look for mappings &mdash; no more than one per line &mdash; *e.g.* `GUITARIST` &rarr; `GUITAR`.

When parsed in this manner, only one key should be parsed per line.

[`rps101.py`](./rps101.py) also verifies that the 101 sets of 50 keys that each key beats are disjoint. There are C(100, 50) = 100891344545564193334812497256 different disjoint 50-sets of 100 elements &mdash; [RPS-101](https://www.umop.com/rps101.htm) chooses 101 of them. The articles by [Marc Chamberland &amp; Eugene Herman](https://chamberland.math.grinnell.edu/papers/rps.pdf) and [Juhn D. Cook](https://www.johndcook.com/blog/2018/08/07/rock-paper-scissors-lizard-spock/) explain the options for balanced RPS games.

## TODO

- One specific approach to creating the 101 cases is to use the [RPS-101](https://www.umop.com/rps.htm) order and, for each case, pick the next 50 (modulo 101) as losers and the previous 50 (modulo 101) as winners.
- The [`rps101.py`](./rps101.py) [Python](https://docs.python.org/3/) script parses all [outcomes](https://www.umop.com/rps101/alloutcomes.htm) text as copy-pasted [here](./rps-101-full.txt) by (esentially) looking for the last key variants on each line. However, all [outcomes](https://www.umop.com/rps101/alloutcomes.htm) in the HTML are linked, so any that are *not* the last key variants on every line can be specifically verified.
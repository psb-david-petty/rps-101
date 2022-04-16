/** RPS is a class that simulates the Rock / Paper / Scissors Lizzard Spock game.
 * https://bigbangtheory.fandom.com/wiki/Rock,_Paper,_Scissors,_Lizard,_Spock
 */
public class RPSLS {
    public enum Move { ROCK, PAPER, SCISSORS, LIZZARD, SPOCK, BAD, };

    private String name;
    public RPSLS(String name) { this.name = name; }

    public static void echo(String message) { System.out.printf("%s", message); }
    public void win() { echo(String.format("%s win! ", name)); }
    public void lose() { echo(String.format("%s lose! ", name)); }
    public void tie() { echo(String.format("A tie!")); }
    public void bad() { echo(String.format("Bad move!")); }

    public Move randomMove() {
        Move move = Move.values()[(int) (Math.random() * Move.values().length)];
        echo(String.format("%s:%s ", name, move));
        return move;
    }

    /** Call randomMove() for this and competitor then invoke
     * win(), lose(), and tie() appropriately.
     * @param competitor RPS competitor
     */
    public void move(RPSLS competitor) {
        switch (competitor.randomMove()) {
            // Competitor ROCK
            case ROCK:
                switch (this.randomMove()) {
                    case ROCK:
                        tie();
                        break;
                    case PAPER:
                    case SPOCK:
                        competitor.lose(); this.win();
                        break;
                    case SCISSORS:
                    case LIZZARD:
                        competitor.win(); this.lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            // Competitor PAPER
            case PAPER:
                switch (this.randomMove()) {
                    case ROCK:
                    case SPOCK:
                        competitor.win(); this.lose();
                        break;
                    case PAPER:
                        tie();
                        break;
                    case SCISSORS:
                    case LIZZARD:
                        competitor.lose(); this.win();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            // Competitor SCISSORS
            case SCISSORS:
                switch (this.randomMove()) {
                    case ROCK:
                    case SPOCK:
                        competitor.lose(); this.win();
                        break;
                    case PAPER:
                    case LIZZARD:
                        competitor.win(); this.lose();
                        break;
                    case SCISSORS:
                        tie();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            // Competitor LIZZARD
            case LIZZARD:
                switch (this.randomMove()) {
                    case ROCK:
                    case SCISSORS:
                        competitor.lose(); this.win();
                        break;
                    case PAPER:
                    case SPOCK:
                        competitor.win(); this.lose();
                        break;
                    case LIZZARD:
                        tie();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            // Competitor SPOCK
            case SPOCK:
                switch (this.randomMove()) {
                    case ROCK:
                    case SCISSORS:
                        competitor.win(); this.lose();
                        break;
                    case PAPER:
                    case LIZZARD:
                        competitor.lose(); this.win();
                        break;
                    case SPOCK:
                        tie();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            default:
                bad();
                break;
        }
    }

    public static void main(String[] args) {
        int times = 20;
        if (args.length > 0)
            times = Integer.parseInt(args[0]);

        RPSLS we = new RPSLS("WE");
        RPSLS they = new RPSLS("THEY");

        for (int i = 0; i < times; i++ ) {
            we.move(they); System.out.printf("\n");
        }
    }
}
/*
# RPS

Implement the Rock / Paper / Scisors game using no `if` / `else` statments &mdash; only `switch` statements and the `Move` `enum`.

[Rock / Paper / Scisors](https://en.wikipedia.org/wiki/Rock_paper_scissors) follows the basic rules that ROCK > SCISSORS > PAPER > ROCK > &hellip; where > means 'beats,'

# RPSLS

An extension is to implement [Rock / Paper / Scissors / Lizard / Spock](https://en.wikipedia.org/wiki/Rock_paper_scissors#Additional_weapons) where ROCK > SCISSORS &amp; LIZARD, PAPER > ROCK &amp; SPOCK, SCISSORS > PAPER &amp; LIZARD, LIZARD > PAPER &amp; SPOCK, and SPOCK > ROCK &amp; SCISSORS.

# RPS-101

If you *really* want to torture yourself, try [RPS-101](https://www.umop.com/rps101.htm)!
 */
// 4567890123456789012345678901234567890123456789012345678901234567890

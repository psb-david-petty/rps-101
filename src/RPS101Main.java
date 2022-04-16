/*
 * RPS101Main.java
 *
 * @author David C. Petty // http://j.mp/psb_david_petty
 */

public class RPS101Main {
    public static final int TIMES = 101;

    public static void main(String[] args) {
        RPS101 we = new RPS101("WE");
        RPS101 they = new RPS101("THEY");

        for (int i = 0; i < TIMES; i++) {
            we.move(they); System.out.printf("\n");
        }
    }
}

public class Pattern {
    public static void main(String[] args) {
        // A PATTERN
        /* for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 0 || j == 4 && i != 0 || i == 3 || i == 0 && j != 0 && j != 4) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */

        // G PATTERN

        /* for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || j == 0 || i == 6 || j == 4 && i != 1 && i != 2 || i == 3 && j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */

        // K PATTERN

        /* for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || i + j == 4 || i - j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } */

        // Q PATTERN
        /* for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0 && i != 5 || j == 4 && i != 5 || i == 0 && j != 5 || i == 4 && j != 5 || j > 1 && i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        } */
    }
}

/**
 * Contains a method to draw the slot machine.
 *
 * Contains a method to draw the slot machine.
 */
public class Graphics {

    /**
     * Draws the slot machine using ASCII in the console.
     *
     * Draws the slot machine using ASCII in the console.
     *
     * @param a Numeric value of a fruit.
     * @param b Numeric value of a fruit.
     * @param c Numeric value of a fruit.
     */
    public static void draw(int a, int b, int c) {
        String border = "*";
        int borderWidth = 15;

        // top row
        System.out.printf("%n" + "%s %s %s", border, border, border);
        System.out.printf("%2s%2s%2s", border, border, border);
        System.out.printf("%2s%2s%2s o", border, border, border);

        // middle row
        System.out.printf("%n" + "%s %d" + "%2s", border, a, border);
        System.out.printf("%2s %d" + "%2s", border, b, border);
        System.out.printf("%2s %d" + "%2s |", border, c, border);

        // bottom row
        System.out.printf("%n" + "%s %s %s", border, border, border);
        System.out.printf("%2s%2s%2s", border, border, border);
        System.out.printf("%2s%2s%2s" + "%n", border, border, border);
    }
}

public class Graphics {

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

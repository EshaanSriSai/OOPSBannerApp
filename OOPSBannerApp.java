/**
 * OOPSBannerApp
 * Displays the word "OOPS"
 * using static helper methods for each letter.
 *
 * @author Eshaan
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(
                    String.join("   ",
                            o[i],
                            o[i],
                            p[i],
                            s[i]
                    )
            );
        }
    }

    // Static method for letter O
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] getP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method for letter S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}
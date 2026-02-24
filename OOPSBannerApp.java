/**
 * OOPSBannerApp
 * Displays the word "OOPS"
 * using compact array initialization and String.join().
 *
 * @author Eshaan
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[] {

            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", "*     *", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "      *"),
            String.join("   ", "*     *", "*     *", "*     *", "      *"),
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** ")

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
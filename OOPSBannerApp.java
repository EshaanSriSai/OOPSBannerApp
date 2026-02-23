/**
 * OOPSBannerApp
 * Displays the word "OOPS" using String array and loops.
 *
 * @author Eshaan
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "*     *", "*      "),
                String.join("   ", "*     *", "*     *", "*     *", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "      *"),
                String.join("   ", "*     *", "*     *", "*     *", "      *"),
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
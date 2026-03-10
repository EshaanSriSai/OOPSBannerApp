import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * Uses a HashMap to store character patterns and render the banner.
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String word = "OOPS";

        int height = 7;

        for (int row = 0; row < height; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                System.out.print(pattern[row] + "   ");

            }

            System.out.println();
        }
    }

    // Function to build character pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }
}
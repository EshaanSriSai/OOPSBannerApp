import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 * UC8: Store character patterns in HashMap
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String word = "OOPS";
        int height = 7;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);
                System.out.print(pattern[i] + "   ");

            }

            System.out.println();
        }
    }

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
import java.util.HashMap;
import java.util.Map;

public class Compare2StrSize {

    public static void main(String[] args) {

        boolean r1 = compare2Strings("Apple", null);
        boolean r2 = compare2StringsV2("Apple", null);
        // boolean r3 = compare2StringsV2("Apple", "Apple");

        String[] strings2 = { "Apple", "" };

        System.out.println(r1);
        System.out.println(r2);
        // System.out.println(r3);

        compare2StringsV3(strings2);

    }

    // Method 1
    public static boolean compare2Strings(String a, String b) {
        boolean result = false;
        a.compareTo(b);
        return result;
    }
    // Method 2

    public static boolean compare2StringsV2(String a, String b) {
        boolean result = false;
        a.equalsIgnoreCase(b);
        return result;
    }

    // Method 3
    public static Map<String, Integer> compare2StringsV3(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }

        System.out.println(map);
        return map;
    }

}

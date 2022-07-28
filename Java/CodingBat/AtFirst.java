public class AtFirst {

    public static void main(String[] args) {

        String result = "Hello";
        System.out.println(atFirst(result));
        System.out.println(atFirst("H"));
        System.out.println(atFirst(""));

    }

    public static String atFirst(String str) {
        String result = "";
        if (str.length() < 2) {
            result = str + "@";
        } else if (str.length() == 2) {
            result = str;
        } else {
            result = str.substring(0, 2);
        }
        if (str.length() == 0) {
            result = "@" + "@";
        }
        return result;
    }
}
/**
 * 
 * Given a string, return a string length 2 made of its first 2 chars.
 * If the string length is less than 2, use '@' for the missing chars.
 * 
 * Test cases atFirst("hello") → "he"
 * atFirst("hi") → "hi"
 * atFirst("h") → "h@"
 */

public class MinCat {

    /**
     * 
     * Given two strings, append them together (known as "concatenation")
     * and return the result. However, if the strings are different lengths,
     * omit chars from the longer string so it is the same length as the shorter
     * string.
     * So "Hello" and "Hi" yield "loHi". The strings may be any length.
     * 
     * Test Cases:
     * minCat("Hello", "Hi") → "loHi"
     * minCat("Hello", "java") → "ellojava"
     * minCat("java", "Hello") → "javaello"
     */

    public static void main(String[] args) {

        System.out.println(minCat("ca", "cat"));
        System.out.println(minCat("sala", "cat"));

    }

    public static String minCat(String a, String b) {
        String result = "";

        if (a.length() == b.length()) {
            return a + b;
        }

        if (a.length() > b.length()) {
            int smallerStr = a.length() - b.length();
            result = a.substring(smallerStr, a.length()) + b;
        } else {
            int smallerStr = b.length() - a.length();
            result = a + b.substring(smallerStr, b.length());
        }

        return result;
    }

}

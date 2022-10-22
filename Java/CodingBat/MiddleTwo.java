
public class MiddleTwo {
    public static void main(String[] args) {
        // test case 1
        String str = "string";

        String result = middleTwo(str);
        System.out.println(result);

        // test case 2
        String str2 = "code";

        String r2 = middleTwo(str2);
        System.out.println(r2);

        // test case 3
        String str3 = "Practice";

        String r3 = middleTwo(str3);
        System.out.println(r3);

        String str4 = "lava";

        String s4 = middleTwoSimpleVersion(str4);
        System.out.println(s4);

    }

    public static String middleTwo(String str) {
        String result = "";

        int len = str.length();
        // keeping track of the half
        int fHalf = len / 2;

        // first half of the string
        String firstHalfString = str.substring(0, fHalf);
        // Last letter of the first half of the string
        String lastLtrOfFirstHalf = firstHalfString.substring(firstHalfString.length() - 1);

        // now we need to fing the second half of the
        String secondHalfString = str.substring(fHalf);

        // first letter of the second half of the string
        String firstLtrOfSecondHalf = secondHalfString.substring(0, 1);

        result = lastLtrOfFirstHalf + firstLtrOfSecondHalf;

        return result;
    }

    public static String middleTwoSimpleVersion(String str) {

        int half = str.length() / 2;
        return str.substring(half - 1, half + 1);

    }

}

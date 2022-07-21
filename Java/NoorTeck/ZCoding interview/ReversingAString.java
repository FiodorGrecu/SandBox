public class ReversingAString {

    public static void main(String[] args) {
        String result = "Java";
        reverseString(result);
    }

    public static String reverseString(String str) {
        String result = "";

        char[] strArr = str.toCharArray();
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.println(strArr[i]);
        }

        return result;
    }
}

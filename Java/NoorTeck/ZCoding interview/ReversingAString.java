public class ReversingAString {

    public static void main(String[] args) {
        String result = "Java";
        reverseString(result);
    }

    public static String reverseString(String str) {

        String result = "";

        // Step 1. Convert string into charArray
        char[] strArr = str.toCharArray();

        // Step 2. Creating a temporary string
        String tempString = "";

        for (int i = strArr.length - 1; i >= 0; i--) {
            // appending the elements to the temporary string
            tempString = tempString + strArr[i];

        }
        // Printing the string backwards
        System.out.println(tempString);
        return result;
    }
}

public class ReversingAString {

    public static void main(String[] args) {
        String str = "Java";

        char[] strArr = str.toCharArray();

        String tempStr = "";

        for (int i = strArr.length - 1; i >= 0; i--) {
            tempStr = tempStr + strArr[i];
        }
        System.out.println("The original string: " + str);
        System.out.println("The reversed string string: " + tempStr);
        System.out.println("************");
        String str1 = "SQL";
        String str2 = "Selenium";
        System.out.println(reverseString(str1));
        System.out.println(reverseString(str2));

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

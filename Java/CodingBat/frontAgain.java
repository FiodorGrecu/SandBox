public class frontAgain {

    public static void main(String[] args) {

        String str = "edited";
        String str1 = "edite";

        System.out.println(frontAgain1(str));
        System.out.println(frontAgain1(str1));
    }

    public static boolean frontAgain1(String str) {

        if (str.length() == 0 || str.length() == 1) {
            return false;
        }
        String first2 = str.substring(0, 2);
        String last2 = str.substring(str.length() - 2);
        if (first2.equals(last2)) {
            return true;
        } else {
            return false;
        }
    }
}
/**
 * 
 * 
 * Given a string, return true if the first 2 chars in the string also
 * appear at the end of the string, such as with "edited".
 * 
 * 
 * frontAgain("edited") → true
 * frontAgain("edit") → false
 * frontAgain("ed") → true
 */
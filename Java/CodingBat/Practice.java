
public class Practice {

    public static void main(String[] args) {

        // int num = 1337;
        // System.out.println(getInt(num));

        String str = "ab";
        String last = str.substring(str.length() - 1);
        String first = str.substring(str.length() - 2, str.length() - 1);
        System.out.println(last);
        System.out.println(first);

    }

    // public static int getInt(int num) {

    // String number = String.valueOf(num);

    // System.out.println(number); // this technically is the line 7

    // int countDigit = 0;
    // if (num < 2) {
    // return num;
    // }
    // while (num != 0) {
    // num = num / 10;
    // countDigit += 1;

    // }
    // countDigit++;

    // // return number.length();
    // return countDigit;
    // }
}

import java.util.Collections;

public class Practice {

    public static void main(String[] args) {

        int num = 1337;
        System.out.println(getInt(num));

    }

    public static int getInt(int num) {

        String number = String.valueOf(num);
        // System.out.println(number);
        // System.out.println(number);

        int countDigit = 0;
        if (num < 2) {
            return num;
        }
        while (num != 0) {
            num = num / 10;
            countDigit += 1;

        }
        countDigit++;

        // return number.length();
        return countDigit;
    }
}

public class NearTen {

    // Given a non-negative number "num", return true if num is within 2 of a
    // multiple of 10.
    // Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
    public static void main(String[] args) {

        int num = 12;
        int num1 = 6;
        int num2 = 19;
        int num3 = 123;
        System.out.println(nearTen(num)); // true 12 is close to 10
        System.out.println(nearTen(num1)); // false, 6 is not within 2 close to 10
        System.out.println(nearTen(num2)); // true, 19 is within 2 close to 20
        System.out.println(nearTen(num3)); // false, 123 is not within 2 close to 120

    }

    public static boolean nearTen(int num) {
        boolean result = false;

        if (num % 10 <= 2 || num % 10 >= 8) {
            result = true;
        }

        return result;
    }

}

public class MethodDemo {

    public static void main(String[] args) {

        getDayOfTheWeek(9);
        getDayOfTheWeek(2);
        getDayOfTheWeek(6);

    }

    public static void getDayOfTheWeek(int number) {

        if (number == 1) {
            System.out.println("Mondat");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednsday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please enter a number 1-7!");
        }

    }
}

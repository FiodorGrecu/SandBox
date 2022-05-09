public class DoubleTotal {

    public static void main(String[] args) {

        boolean amISleeping = sleepIn(false, false);
        System.out.println(amISleeping);

    }

    public static boolean sleepIn(boolean isWeekday, boolean isVacation) {
        boolean result = false;

        if (isWeekday == false || isVacation == true) {
            result = true;
        } else {
            result = false;
        }
        // else part is not required because result is Already false by default on line
        // 4
        return result;
    }

}

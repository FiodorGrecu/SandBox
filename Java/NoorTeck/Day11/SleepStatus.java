public class SleepStatus {

    public static void main(String[] args) {

        boolean amISleeping = sleepIn(false, false);
        System.out.println(amISleeping);

    }
    // VERSION 1

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
/**
                 INSTRUCTIONS OF THE PROBLEM:

                Write a method that takes Boolean parameters "isWeekday" and "isVacation".
                
                The parameter "isWeekday" is true if it is a weekday, the parameter "isVacation"
                is true if we are on vacation. We sleep in if it is not a weekday otherwise return false.
                
                Then call your function from main method: Create a Boolean variable in your main method and 
                assign the value what "sleepIn" method returns 
                Variable Name: Boolean amIsleeping;
                
                Example:
                if pass false, false value then your method should return true
                sleepIn (false, false) → true
            
 */
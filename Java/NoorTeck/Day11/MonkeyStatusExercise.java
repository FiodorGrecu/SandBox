public class MonkeyStatusExercise {
   
    /**
            REQUIREMENTS OF THE PROBLEM:

        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We 
        in  trouble if they are both smilling or if neither of them is smiling. 
        Return true if we are in trouble otherwise return false

        Then call your function from main method: Create a Boolean variable in your main method and assign
        the value what "monkeyTrouble" method returns
                • Variable Name : Boolean "areWeInTrouble";

 */

    public static void main(String[] args) {
        
        boolean areWeInTrouble = mokeyTrouble(true, true);
        System.out.println(areWeInTrouble);
       
        boolean areWeInTrouble1 = mokeyTrouble2(false, false);
        System.out.println(areWeInTrouble1);
       
        boolean areWeInTrouble2 = monkeyTrouble3(true, true);
        System.out.println(areWeInTrouble2);

        boolean areWeInTrouble3 = monkeyTrouble4(true, true);
        System.out.println(areWeInTrouble3);
    }
        // Version 1

    public static boolean mokeyTrouble( boolean aSmile, boolean bSmile){
        boolean result = false;

        if ((aSmile && bSmile) == true || (aSmile && bSmile) == false){
            result = true;
        }
        return result;

    }
        // VERSION 2
    public static boolean mokeyTrouble2 (boolean aSmile, boolean bSmile) {
        boolean result = false;

        if ( aSmile == true && bSmile == true){
            result = true;
        } else if ( aSmile == false && bSmile == false){
            result = true;
        } else {
                // This part is not required because result is already false
            result = false;
        }
        return result;
    }
          // VERSION 3
          public static boolean monkeyTrouble3 (boolean aSmile, boolean bSmile) {
            boolean result = false;
    
            if ( aSmile && bSmile ){
                result = true;
            } else if ( !aSmile && !bSmile ){
                result = true;
            } else {
                    // This part is not required because result is already false
                result = false;
            }
            return result;
    
        }
    
                  // VERSION 4
                  public static boolean monkeyTrouble4(boolean aSmile, boolean bSmile) {
        
                    return (( aSmile && bSmile)  || ( !aSmile && !bSmile ));
            
                }
}


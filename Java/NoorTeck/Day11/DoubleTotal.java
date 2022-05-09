public class DoubleTotal {
    



/**
            Create a Java class called DoubleTotal

3. Write a method that takes 2 integer parameters

    Given two int values, return their sum. If the two values are the same (Parameter 1 and Parameter 2),
    then return double their sum.

    Then call your function from main method: Create an int variable in your main method and assign the
    value what sumDouble method returns

        • Variable Name: int myTotal;

                Example:

        if pass 1, 2 value then your method should return 3
            sumDouble (1,2) → 3
        if pass 3, 2 value then your method should return 5
            sumDouble (3,2) → 5
        if pass 2, 2 value then your method should return 8
            sumDouble (2,2) → 8
 */

        public static void main(String[] args) {
            // Refering version 1
            int myTotal = sumDouble(2, 2);
            System.out.println(myTotal);
            int myTotal1 = sumDouble(5, 2);
            System.out.println(myTotal1);
            int myTotal2 = sumDouble(5, 12);
            System.out.println(myTotal2);
System.out.println("********");
            // Refering version 2
            int myTotal_v1 = sumDouble1(2, 2);
            System.out.println(myTotal_v1);
            int myTotal_v2 = sumDouble1(5, 2);
            System.out.println(myTotal_v2);
            int myTotal_v3 = sumDouble1(5, 12);
            System.out.println(myTotal_v3);
        }
            // VERSION 1
        public static int sumDouble (int valueOne, int valueTwo) {
            int result = 0;
            int sum = valueOne + valueTwo;

            if ( valueOne == valueTwo){
                result = sum * 2;

            } else {
                result = sum;
            }

            return result;

        }
       // VERSION 2
       public static int sumDouble1 (int valueOne, int valueTwo) {
        int result = 0;

        if ( valueOne == valueTwo){
            result = (valueOne + valueTwo) * 2;

        } else {
            result = valueOne + valueTwo;
        }

        return result;

    }
        

}
public class GetResult {
    public static void main(String[] args) {
        
        getResult(4,2);
        getResult(2,5);
        getResult(3,3);

    }

    public static void getResult( int numOne, int numTwo){

        int diff = 0;
        int sum = 0;
        int result = 0;

        if (numOne > numTwo){

            diff = numOne - numTwo;
            System.out.println(numOne + " - " + numTwo + " = " + diff );

        } else if ( numOne < numTwo) {

            sum = numOne + numTwo;
            System.out.println(numOne + " + " + numTwo + " = " + sum );

        }else{
            result = numOne * numTwo;
            System.out.println(numOne + " x " + numTwo + " = " + result );

        }

    }
}

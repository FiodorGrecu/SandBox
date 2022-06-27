public class ResultDemo {


    public static void main(String[] args) {
        result(2,3);
        result(7,3);
        result(2,2);
    }

    public static void result(int numOne, int numTwo) {

        if (numOne > numTwo) {
            System.out.println(numOne - numTwo);
        } else if (numOne < numTwo) {
            System.out.println(numOne + numTwo);
        } else {
            System.out.println(numOne * numTwo);
        }
    }

}

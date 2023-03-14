package codingInterview;

public class FibonnaciSequence {

    public static void main(String[] args) {

        getFibonacciNum(3);
    }

    public static void getFibonacciNum(int num){

        int firstFibNum = 0;
        int secondFibNum = 1;

        for (int i = 1; i < num; i++) {

            // get the fibNum
            int fibNum = firstFibNum + secondFibNum;

            // then I swap the numbers
            firstFibNum = secondFibNum;
            secondFibNum = fibNum;

            System.out.println(fibNum);
        }



    }


}

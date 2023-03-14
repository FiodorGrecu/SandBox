package codingInterview;

public class PrintOddAndEven {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};


        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                System.out.println("Number " + arr[i] + " " + "is" + " " + "Odd");
            }

        }
        System.out.println("**************");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0) {
                System.out.println("Number " + arr[i ]+ " " + "is" + " " + "Even");
            }

        }


    }

//    public static void oddOrEven(int num){
//        if (num % 2 == 0) {
//            System.out.println("Even");
//        }
//        else if (num % 2 == 1) {
//            System.out.println("Odd");
//        }
//
//    }

}

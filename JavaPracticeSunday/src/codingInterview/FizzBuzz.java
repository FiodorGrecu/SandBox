package codingInterview;

public class FizzBuzz {

    public static void main(String[] args) {

        int [] numForFizbuzz = {44,56,23,45,67,22,55,234};
        for (int i = 0; i < numForFizbuzz.length; i++) {
//            System.out.println(fizbuzz(numForFizbuzz[i]));
        } 
        System.out.println(fizbuzz(44));


    }

    public static String fizbuzz(int num){
        String result = "";

        for (int i = 0; i < num; i++) {

            if(num % 3 ==0 && num %5 == 0){
                result = "FizzBuzz";
            } else if(num % 3 == 0){
                result ="Fizz";
            }else if (num % 5 == 0){
                result = "Buzz";
            }else {
                 result = Integer.toString(num);
            }
        }

        return result;
    }
}

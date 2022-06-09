public class ClosestTo10 {
    
    public static void main(String[] args) {
        
        ClosestTo10 test = new ClosestTo10();
    
        int nums = test.close10(5, 14);
        System.out.println(nums);
    }

    public int close10(int a, int b){
        int result = 0;

        if(Math.abs(10-a) < Math.abs(10-b)){
            result = a;
        }else{
            result = b;
        }

        return result;
    }
}
/**
            Given 2 int values, return whichever value is nearest to the value 10, 
            or return 0 in the event of a tie. 
            Note that Math.abs(n) returns the absolute value of a number.

            Test Cases:
                close10(8, 13) → 8
                close10(13, 8) → 8
                close10(13, 7) → 0




 */
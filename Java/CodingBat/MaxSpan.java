public class MaxSpan {

    public static void main(String[] args) {
        
        // int nums [] = 

        MaxSpan obj = new MaxSpan();
       int [] test ={1, 2, 1, 1, 3};
        System.out.println(obj.maxSpan(test));
    }

    public int maxSpan(int[] nums){
        int len = 0;
        int largest = 0;

        for(int i = 0; i < nums.length; i++ ){
            for(int j = nums.length-1; j >= 0;  j--){
                if(nums[i] == nums[j]){
                    len = j - i+1;
                    break;
                }
            }
            if(largest < len){
                largest = len;
            }
        }
       return largest;

    }
    
}
/**

        Consider the leftmost and righmost appearances of some value in an array. 
        We'll say that the "span" is the number of elements between the two inclusive. 
        A single value has a span of 1. Returns the largest span found in the given array. 
        (Efficiency is not a priority.)
        TestCases:
            maxSpan([1, 2, 1, 1, 3]) → 4
            maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
            maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */
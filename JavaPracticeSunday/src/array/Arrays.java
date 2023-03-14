package array;

public class Arrays {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4};
//        int first = nums[0];
//        System.out.println(first);

//        System.out.println(nums.deepToString());

        System.out.println(java.util.Arrays.stream(nums).sum());// this adds up the elements of the array
//        nums[0] = 2; //           this will print 2 in the console
        int firstElement = nums[0];
        System.out.println(firstElement);

        System.out.println("**************");

        // ENHANCED FOR-LOOP OR FOR-EACH-LOOP
        for(int i: nums){
            System.out.println(i);
        }
        int sum = 0;
        for (int i : nums) {
            sum = sum + i;     // this is the same as line 13
        }
        System.out.println(sum);
    }
}

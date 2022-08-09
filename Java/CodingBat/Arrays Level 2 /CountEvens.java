public class CountEvens {

    public static void main(String[] args) {
        int [] nums = {2, 1, 2, 3, 4};
        CountEvens obj = new CountEvens();
        int test = obj.countEvens(nums);
        System.out.println(test);
    }
    
    public int countEvens(int [] nums) {
        int count = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
/** 
             Return the number of even ints in the given array. 
            Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

                Test cases:
                        countEvens([2, 1, 2, 3, 4]) → 3
                        countEvens([2, 2, 0]) → 3
                        countEvens([1, 3, 5]) → 0 
*/
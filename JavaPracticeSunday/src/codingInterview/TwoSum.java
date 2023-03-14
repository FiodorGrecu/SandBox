package codingInterview;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

        //LEETCODE

//    Given an array of integers "nums" and an integer "target",
//    return indices of the two numbers such that they add up to "target".

//    You may assume that each input would have exactly one solution,
//    and you may not use the same element twice.

    //EXAMPLE:
        // Input: nums = [2,7,11,15], target = 9
        // Output: [0,1]

    public static int [] twoSum(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        // Keeping track of the second number in the map
        for(int i = 0; i < nums.length; i++){
            int secondNumber = target - nums[i];
            if(map.containsKey(secondNumber) && map.get(secondNumber) != i){
                return new int [] {i, map.get(secondNumber) };
            }
        }

        // In case there is no solution, we will just return null
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,4,7,8};

        for (int i = 0; i < nums.length; i++) {

        }

        System.out.println(twoSum(nums, 6));
    }

}

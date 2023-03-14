package branchingStatements;

public class ForLoopDemo {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 77, 85};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 3) {
                System.out.println(nums[i]);
            }

        }
        System.out.println("*****************************");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);              // will print numbers 0-10
        }
        System.out.println("*****************************");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);              // will print numbers 10-1
        }
        System.out.println("*****************************");

        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);              // will print every other number from 2-10
        }
    }


}

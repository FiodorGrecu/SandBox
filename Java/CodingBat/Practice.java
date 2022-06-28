import java.util.Collections;

public class Practice {
    public static void main(String[] args) {

        // Simple counter program

        // int [] nums = {1,2,4,6};
        // int count = 0;
        // for (var n : nums) {
        // if(n%2 == 0){
        // count++;
        // }

        // }
        // System.out.println(count);

        // String name = "dorel";
        // char [] newName = name.toCharArray();
        // for (String n : newName) { So yes not possible to implement a
        // enhanced for loop to a string

        // }

        String n = "dorel";
        System.out.println(n + n + n);
        // or
        System.out.println(String.join("", Collections.nCopies(4, n)));

    }

}

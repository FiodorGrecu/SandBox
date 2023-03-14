package array;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {3,2,6,1,8};
        
        

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            ;
        }
        System.out.println("****************");
        int sorted[] = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }


        
    }

}

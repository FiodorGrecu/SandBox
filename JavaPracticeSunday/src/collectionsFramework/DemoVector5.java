package collectionsFramework;

import java.util.Vector;

public class DemoVector5 {

    public static void main(String[] args) {


        // Constructor with 2 parameters
        Vector<String> v3 = new Vector<>(2,5);

        System.out.println("V3 Size : " + v3.size()); //0
        System.out.println("V3 Capacity : " + v3.capacity()); // 2

        v3.add("VA");
        v3.add("NJ");

        System.out.println("***************");
        System.out.println("V3 Size : " + v3.size()); //2
        System.out.println("V3 Capacity : " + v3.capacity()); // 2

        v3.add("NJ");

        System.out.println("***************");
        System.out.println("V3 Size : " + v3.size()); //3
        System.out.println("V3 Capacity : " + v3.capacity()); // 7

        v3.add("MD");
        v3.add("TX");
        v3.add("FL");
        v3.add("SD");
        v3.add("IL");

        System.out.println("***************");
        System.out.println("V3 Size : " + v3.size()); //8
        System.out.println("V3 Capacity : " + v3.capacity()); // 12

    }
}

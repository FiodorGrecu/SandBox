package collectionsFramework;

import java.util.Vector;

public class DemoVector3 {
    public static void main(String[] args) {
        // Default constructor
        Vector<String> v1 = new Vector<String>();

        System.out.println("V1 Size : " + v1.size()); //
        System.out.println("V1 Capacity : " + v1.capacity()); // 10

        v1.add("VA");
        v1.add("NJ");
        v1.add("NY");
        v1.add("MD");
        v1.add("TX");
        v1.add("FL");
        v1.add("SD");
        v1.add("IL");
        v1.add("CA");

        System.out.println("*********************");
        System.out.println("V1 Size : " + v1.size()); // 9
        System.out.println("V1 Capacity : " + v1.capacity()); // 10

        System.out.println("*********************");
        v1.add("MO");
        System.out.println("V1 Size : " + v1.size()); // 10
        System.out.println("V1 Capacity : " + v1.capacity()); // 10

        System.out.println("*********************");
        v1.add("VA");
        System.out.println("V1 Size : " + v1.size()); // 11
        System.out.println("V1 Capacity : " + v1.capacity()); // 20


    }
}

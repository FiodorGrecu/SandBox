package collectionsFramework;

import java.util.Vector;

public class DemoVector2 {
    public static void main(String[] args) {

        // Default constructor
        Vector<String> v1 = new Vector<String>();

        // Constructor with 1 param
        Vector<String> v2 = new Vector<>(12);

        // Constructor with 2 parameters
        Vector<String> v3 = new Vector<>(2,5);

        System.out.println("V1 Size:    " + v1.size());
        System.out.println("V1 Capacity:    " + v1.capacity());
        System.out.println("*********************************");

        System.out.println("V2 Size:    " + v2.size());
        System.out.println("V2 Capacity:    " + v2.capacity());

        System.out.println("*********************************");
        System.out.println("V3 Size:    " + v3.size());
        System.out.println("V3 Capacity:    " + v3.capacity());
        System.out.println("*********************************");

    }
}

package collectionsFramework;

import java.util.Vector;

public class DemoVector4 {

    public static void main(String[] args) {
        // Constructor with 1 parameter --> the parameter represents the capacity number
        Vector<String> v2 = new Vector<>(12);

        System.out.println("V2 Size : " + v2.size()); //0
        System.out.println("V2 Capacity : " + v2.capacity()); // 12

        v2.add("VA");
        v2.add("NJ");
        v2.add("NY");
        v2.add("MD");
        v2.add("TX");
        v2.add("FL");
        v2.add("SD");
        v2.add("IL");
        v2.add("CA");

        System.out.println("*******************************");

        System.out.println("V2 Size : " + v2.size()); //9
        System.out.println("V2 Capacity : " + v2.capacity()); // 12

        v2.add("IL");
        v2.add("CA");

        System.out.println("*******************************");
        System.out.println("V2 Size : " + v2.size()); //11
        System.out.println("V2 Capacity : " + v2.capacity()); // 12

        v2.add("CA");

        System.out.println("*******************************");
        System.out.println("V2 Size : " + v2.size()); //12
        System.out.println("V2 Capacity : " + v2.capacity()); // 12

        v2.add("CA");
        System.out.println("*******************************");
        System.out.println("V2 Size : " + v2.size()); //13
        System.out.println("V2 Capacity : " + v2.capacity()); // 24

        for (int i = 0; i < 12; i++){
            v2.add("CA");
        }
        System.out.println("*******************************");
        System.out.println("V2 Size : " + v2.size()); //25
        System.out.println("V2 Capacity : " + v2.capacity()); // 48
    }
}

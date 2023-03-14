package collectionsFramework;

import java.util.Vector;

public class DemoVector {

    public static void main(String[] args) {

        Vector<String> fruit = new Vector<>();

        fruit.add("Orange");
        fruit.add("Pair");
        fruit.add("Apple");

        System.out.println("Size: " +  fruit.size());
        System.out.println(fruit);
    }
}

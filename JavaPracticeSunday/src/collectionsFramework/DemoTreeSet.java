package collectionsFramework;

import java.util.TreeSet;
import java.util.stream.Stream;

public class DemoTreeSet {
    public static void main(String[] args) {

        TreeSet<String> name = new TreeSet<>();

        // Adding elements
        name.add("Adam");
        name.add("Dorel");
        name.add("Natalia");
        name.add("Vasile");
        name.add("Mark");

        System.out.println(name);

        name.add("Mark");
        name.add("Mark");
        System.out.println(name);

        name.add(null); // Exception, null is not allowed
        System.out.println(name);


    }
}

package collectionsFramework;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {

        // Creating an object called nameSet
        HashSet<String> nameSet = new HashSet<>();

        // Adding elements
        nameSet.add("Adam");
        nameSet.add("Dorel");
        nameSet.add("Natalia");
        nameSet.add("Vasile");
        nameSet.add("Mark");

        System.out.println(nameSet);

        // Adding a duplicate value
        nameSet.add("Seb");
        nameSet.add("Dorel");
        System.out.println(nameSet);

        //adding null value
        nameSet.add(null);
        nameSet.add(null);
        System.out.println(nameSet);


        for (int i = 0; i < nameSet.size(); i++){
            System.out.println(i);
        }

        for(String n: nameSet){
            System.out.println(n);
        }

    }
}

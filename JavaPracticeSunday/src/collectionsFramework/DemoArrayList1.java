package collectionsFramework;

import java.util.ArrayList;

public class DemoArrayList1 {

    public static void main(String[] args) {

        // Crated ArrayList object
        ArrayList<String> states = new ArrayList<String>();

        // Adding new elements to the list
        states.add("VA");
        states.add("MD");
        states.add("NY");
        states.add("NJ");
        states.add("FL");

        // print the arrayList
        System.out.println(states);

        System.out.println("**********");
        // add "NC" at index 1
        states.add(1, "NC");
        System.out.println(states);

        System.out.println("**********");

        // get the number of elements in the arrayList
        System.out.println("Size :" + states.size());

        // get the value at index 4
        System.out.println("Retrieve Value: " + states.get(4));

        // remove value from arrayList
        states.remove(2);
        System.out.println("After removing: " + states);
    }
}

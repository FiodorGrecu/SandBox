import java.util.ArrayList;

public class DemoArrayList {

    public static void main(String[] args) {

        // Creating an ArrayList Object
        ArrayList<String> states = new ArrayList<String>();

        // adding elements to the ArrayList
        states.add("VA");
        states.add("NY");
        states.add("MD");
        states.add("NJ");
        states.add("TX");

        // Printing the ArrayList
        System.out.println(states);

        // adding another element to the position 1
        states.add(1, "TX");
        System.out.println("**********");
        System.out.println(states);

        // getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + states.size());

        // Getting the Value at certain position (for example 3)
        System.out.println(states.get(3)); // MD

        // Removing an element from the ArrayList object
        System.out.println(states.remove(0)); // VA
        System.out.println(states);

    }

}

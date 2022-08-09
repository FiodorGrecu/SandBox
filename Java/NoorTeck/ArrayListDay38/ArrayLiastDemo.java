import java.util.ArrayList;
public class ArrayLiastDemo {
    
    public static void main(String[] args) {
        
        // Creating an ArrayList
        ArrayList<String> states = new ArrayList<String>();

        // adding elements to the list
        states.add("VA");
        states.add("NY");
        states.add("MN");
        states.add("TX");
        states.add("OH");
        states.add("HI");

        // printing the list of states
        System.out.println(states);

        // adding another element at the position 1
        states.add("NJ");

        System.out.println("*******************");
        System.out.println(states);
        
        // getting the size of the array
        System.out.println("The size of the array is: " + states.size());

        // getting the value at a specific index position
        System.out.println("Retrieveing the value for index 4: " + states.get(4));
        System.out.println("And the value at position 5 is: " + states.get(5));

        // removing a value at a cetrain position
        System.out.println("Removing the value for index 3: " +states.remove(3)); 

    }
}

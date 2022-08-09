import java.util.ArrayList;
public class ArrayListDemo2 {
    
    public static void main(String[] args) {
        
        ArrayList<String> states = new ArrayList<String>();

        // Adding new element to the ArrayList
		states.add("NY");
		states.add("FL");
		states.add("VA");
		states.add("CA");
		states.add("TX");
		states.add("NY");

        // Printing states array
        System.out.println(states);

        // iterating through array using enhanced for loop
        for (String s : states) {
            System.out.println(s);
        }
        System.out.println("**********");
        // iterating through array using regular for loop
        for (int i = 0; i < states.size(); i++) {
            System.out.println(states.get(i));
        }
    }
}

package collectionsFramework;

import java.util.ArrayList;

public class DemoArrayList2 {

    public static void main(String[] args) {

        // Crated ArrayList object
        ArrayList<String> states = new ArrayList<String>();

        // Adding new elements to the list
        states.add("VA");
        states.add("MD");
        states.add("NY");
        states.add("NJ");
        states.add("FL");
        states.add("VA");
        states.add("CA");

        System.out.println(states);

        // LOOPS

        // For Each Loop
        System.out.println("For Each **********");
        for (String s: states) {
            System.out.println(s);
        }
        System.out.println("For Loop **********");
        // For  Loop
        for(int i = 0; i < states.size(); i++){
            System.out.println(states.get(i));
        }
        System.out.println("While Loop **********");
        // While Loop
        int i = 0;
       while (i < states.size()) {
           System.out.println(states.get(i));
           i++;
       }
        System.out.println("Do while Loop **********");
        // Do While Loop
        int j = 0;
        do {
            System.out.println(states.get(j));
            j++;
        }while (j < states.size());


    }
}

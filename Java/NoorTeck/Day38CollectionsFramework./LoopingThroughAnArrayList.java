import java.util.ArrayList;

public class LoopingThroughAnArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Alisa");
        names.add("Vera");
        names.add("Pasha");
        names.add("Dima");
        names.add("Dorel");

        // printing the ArrayList
        System.out.println(names);

        // Enhanced ForLoop
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println("**********");

        // Regular forLoop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println("**********");

        // Reversed forLoop
        for (int i = names.size() - 1; i >= 0; i -= 2) {
            System.out.println(names.get(i));
        }

        // While Loop

        // code ...

        // do while loop

        // code ...
    }

}

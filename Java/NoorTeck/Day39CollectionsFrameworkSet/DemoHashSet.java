import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {

        HashSet<String> nameSet = new HashSet<String>();

        nameSet.add("Adam");
        nameSet.add("Walid");
        nameSet.add("John");
        nameSet.add("Elmer");
        nameSet.add("Phil");

        System.out.println(nameSet);

        // adding duplicate value
        nameSet.add("Adam"); // will be overriden
        System.out.println("**********");
        System.out.println(nameSet);
        // null value //
        nameSet.add(null); // only one allowed
        nameSet.add(null);

        System.out.println("**********");
        System.out.println(nameSet);

        // deleting and element
        nameSet.remove("Walid");

        // HashSet can only use Enhanced ForLoop because it is not index based
        for (String string : nameSet) {
            System.out.println(string);
        }

    }
}

import java.util.ArrayList;

public class HomeworkDemo1 {

    public static void main(String[] args) {

        /**
         * 1. Write a Java program to create a new array list, add some colors (string)
         * and print out the collection.
         */

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Black");
        colors.add("Orange");

        System.out.println(colors);

        // 2. Write a Java program to iterate through all elements in a array list.
        System.out.println("$$$$$$$$$$$$$$$$$$$");
        for (String c : colors) {
            System.out.println(c);
        }

        // 3. Write a Java program to insert an element into the array list at the first
        // position.
        System.out.println("$$$$$$$$$$$$$$$$$$$");

        colors.add(0, "Purple");
        System.out.println(colors);

        // 4. Write a Java program to retrieve an element (at a specified index) from a
        // given array list.
        System.out.println("***********");
        System.out.println(colors.get(3));

        // 5. Write a Java program to update specific array element by given element.
        System.out.println("***********");
        colors.set(3, "Azure");
        System.out.println(colors);
        // 6. Write a Java program to remove the third element from a array list.
        System.out.println("***********");
        colors.remove(3); // Azure is removed
        System.out.println(colors);
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class HWDemo2 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Black");
        colors.add("Orange");

        System.out.println(colors);

        // 7. Write a Java program to search an element in a array list.
        System.out.println("********************");
        System.out.println(colors.indexOf("Blue"));
        System.out.println(colors);

        System.out.println("********************");

        // 8. Write a Java program to sort a given array list.
        // Creating an Object of Parent class with reference to child class

        Collections.sort(colors); // ascending order.
        System.out.println(colors);
        System.out.println("********************");
        Collections.reverse(colors); // descending order
        System.out.println(colors);

    }

}
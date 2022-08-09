import java.util.ArrayList;
import java.util.Collections;

public class HWDemo3 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Black");
        colors.add("Orange");

        // 9. Write a Java program to copy one array list into another.
        ArrayList<String> newColors = new ArrayList<String>(colors);

        System.out.println(newColors); // new arrayList
        System.out.println(colors); // old arrayList
        System.out.println("********************");

        // 10. Write a Java program to shuffle elements in a array list.
        // Collections.shuffle(colors); // everytime you shuffle a new order of elements
        // ocures
        // System.out.println(colors);
        // System.out.println("********************");

        // 11. Write a Java program to reverse elements in a array list.
        Collections.reverse(colors); // descending order
        System.out.println(colors);
    }
}

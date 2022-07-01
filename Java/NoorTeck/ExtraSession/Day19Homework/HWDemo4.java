import java.util.ArrayList;
import java.util.List;

public class HWDemo4 {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Black");
        colors.add("Orange");
        System.out.println("The full arrayList: " + colors);

        // 12. Write a Java program to extract a portion of a array list.
        // first we have to import list
        // then we can perform the method from the list interface
        List<String> subList = colors.subList(0, 4);
        System.out.println("List of the first four elements: " + subList);

    }
}

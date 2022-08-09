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
        System.out.println("The original ArrayList:" + colors);

        // 12. Write a Java program to extract a portion of a array list.
        // first we have to import list
        // then we can perform the method from the list interface
        List<String> subList = colors.subList(0, 4);
        System.out.println("List of the first four elements: " + subList);

        // 13. Write a Java program to compare two array lists.
        ArrayList<String> newColors = new ArrayList<String>();

        newColors.add("Blue");
        newColors.add("Gray");
        newColors.add("Red");
        newColors.add("Yellow");
        newColors.add("Salmon");
        newColors.add("Black");
        newColors.add("Azure");

        for (String color : newColors) {
            if (colors.contains(color)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

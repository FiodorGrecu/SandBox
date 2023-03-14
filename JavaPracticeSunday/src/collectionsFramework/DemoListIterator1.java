package collectionsFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DemoListIterator1 {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();

        name.add("Ehetsh");
        name.add("Natalia");
        name.add("Sebi");
        name.add("Maria");
        name.add("Bunelu");

        //create a Iterator Object and move the cursor right before the first element
        ListIterator<String> it = name.listIterator();

        System.out.println(it.hasNext()); //true
        System.out.println(it.hasPrevious()); //false

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(it.hasNext()); //false
        System.out.println(it.hasPrevious()); //true

        System.out.println("Looping backwards  *********************");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}

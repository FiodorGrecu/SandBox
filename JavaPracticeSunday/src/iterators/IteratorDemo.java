package iterators;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        // Creation of a List using a generic type
        List <String>str = new ArrayList<>();

        str.add("Phone");
        str.add("Computer");
        str.add("Pen");

        Iterator<String> iter = str.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            System.out.println(next);
        }

        // We can also create a List without a generic type but then we will need to cast the type each time
        //  we iterate over the list

        List myList = new ArrayList<>();

        myList.add("Apple");
        myList.add("Cherry");
        myList.add("Pear");

        Iterator i = myList.iterator();
        while (i.hasNext()) {
            String next = (String) i.next();
            System.out.println(next);
        }

    }
}

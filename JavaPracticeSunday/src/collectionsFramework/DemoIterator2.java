package collectionsFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator2 {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Sebastian");
        nameList.add("Pedro");
        nameList.add("Vasile");
        nameList.add("Mark");

        System.out.println(nameList);

        // Crate an Objec of Iterator
        Iterator<String> iter = nameList.iterator();

        System.out.println(iter.next()); // Sebastian
        System.out.println(iter.next()); // Pedro
        System.out.println(iter.next()); // Vasile
        System.out.println(iter.next()); // Mark

        System.out.println(iter.hasNext()); // false... throw exception NO
        System.out.println(iter.next());    // THROWS EXCEPTIONS


//        next() --> it will return the value of the next element and move the cursor to the next waiting area

//         hasNext() --> it will check if we have value for the next elem,
//                      returns true if there is a value otherwise false
    }
}

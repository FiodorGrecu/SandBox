package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoIterator1 {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Mili");
        nameList.add("Alex");
        nameList.add("Nata");
        nameList.add("Fiodor");

        Iterator<String> iter = nameList.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}

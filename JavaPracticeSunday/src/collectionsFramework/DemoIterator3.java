package collectionsFramework;

import java.util.HashSet;
import java.util.Iterator;

public class DemoIterator3 {

    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();

        num.add(22);
        num.add(24);
        num.add(56);
        num.add(14);
        num.add(25);
        num.add(25);


        System.out.println(num);
        System.out.println("***************");
//        Using Iterator iterate through this collection
        Iterator<Integer> n = num.iterator();

        while (n.hasNext()) {
            System.out.println(n.next());
        }


        System.out.println("***************");


    }

}

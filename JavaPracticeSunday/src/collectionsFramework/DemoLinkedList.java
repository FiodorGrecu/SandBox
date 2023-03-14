package collectionsFramework;

import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Natalia");
        names.add("Sebastian");
        names.add("John");
        names.add("Edward");

        //print
        System.out.println(names);

        //get the size
        System.out.println(names.size());

        //get the element at index position 2
        System.out.println(names.get(3));

        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        // add element in the beginningof the LinkedList
        names.addFirst("Vasile");

        //add element at the end of the LinkedList
        names.addLast("Ion");

        System.out.println(names);

        System.out.println("*************");
        names.add(2,"Issam");
        System.out.println(names);


    }
}

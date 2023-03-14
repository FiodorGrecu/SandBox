package collectionsFramework;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class DdemoQueue1 {
    public static void main(String[] args) {

        Queue<String> chipotle = new LinkedList<String>();

        chipotle.add("Adam");
        chipotle.add("Fahim");
        chipotle.add("Muhammed");
        chipotle.offer("Natalia");
        chipotle.offer("Sebastian");
        chipotle.offer("Fiodor");

        System.out.println("Queue: " + chipotle);

        System.out.println("Element: " + chipotle.element()); //Adam
        System.out.println("Peek: " + chipotle.peek());       //Adam
    }
}

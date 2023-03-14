package collectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoIterator4 {
    public static void main(String[] args) {

        HashMap<Integer, String> courseMap = new HashMap<Integer,String>();

        courseMap.put(100, "Java");
        courseMap.put(220, "Selenium");
        courseMap.put(300, "SQL");
        courseMap.put(400, "API");
        courseMap.put(500, "JUnit");

        // using Iterator iterate through the courseMap
        Iterator<Map.Entry<Integer, String>> itr = courseMap.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<Integer, String> entry = itr.next();

            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());

            System.out.println("*************");
        }

    }


}

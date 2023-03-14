package collectionsFramework;

import java.util.HashMap;

public class DemoHashMap3 {
    public static void main(String[] args) {

        HashMap<Integer, String> courseMap = new HashMap<>();

        courseMap.put(100, "Java");
        courseMap.put(200, "SQL");
        courseMap.put(300, "Selenium");
        courseMap.put(400, "API");
        courseMap.put(500, "Maven");

        // Looping through the KEYS only and print 1 at the time

        for(Integer key: courseMap.keySet()){
            System.out.println(key);
        }

        System.out.println("***************");

        // Loops through the VALUES only and print 1 at a time

        for(String val : courseMap.values()){
            System.out.println(val);
        }



    }
}

package collectionsFramework;

import java.util.HashMap;

public class DemoHashMap2 {
    public static void main(String[] args) {

        HashMap<Integer, String> courseMap = new HashMap<>();

        courseMap.put(100, "Java");
        courseMap.put(200, "SQL");
        courseMap.put(300, "Selenium");
        courseMap.put(400, "API");
        courseMap.put(500, "Maven");

        System.out.println(courseMap);

        System.out.println(courseMap.get(100)); // Java
        System.out.println(courseMap.get(200)); // SQL

        System.out.println(courseMap.containsKey(300)); // true
        System.out.println(courseMap.containsKey(200)); // true
        System.out.println(courseMap.containsKey(3020));// false

        System.out.println("************");

        System.out.println(courseMap.containsValue("Java")); // true
        System.out.println(courseMap.containsValue("SQL"));  // true
        System.out.println(courseMap.containsValue("SQ"));   // false

        // keySet() --> returns set of KEYS (returns all the keys in the map)
        System.out.println("Keys: " + courseMap.keySet());

        // values() --> returns all the values in the map
        System.out.println("Values: " + courseMap.values());

        // entrySet() --> returns all the key-value pairs in the map
        System.out.println("Key-Value: " + courseMap.entrySet());
    }
}

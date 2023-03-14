package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap4 {

    public static void main(String[] args) {
        HashMap<Integer, String> courseMap = new HashMap<>();

        courseMap.put(100, "Java");
        courseMap.put(200, "SQL");
        courseMap.put(300, "Selenium");
        courseMap.put(400, "API");
        courseMap.put(500, "Maven");

        for(Map.Entry<Integer,String> entry : courseMap.entrySet()){

            System.out.println("Key: " + entry.getKey()) ;
            System.out.println("Value: " + entry.getValue());
            System.out.println("*****************");
        }
    }
}

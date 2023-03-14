package collectionsFramework;

import java.util.HashMap;
import java.util.TreeMap;

public class DemoTreeMap1 {

    public static void main(String[] args) {

        TreeMap<String, Integer> numMap = new TreeMap<>();

        numMap.put("Fiodor" ,7);
        numMap.put("Charlene" ,17);
        numMap.put("Ehtesham" ,77);
        numMap.put("Issam" ,34);
        numMap.put("Brian" ,3);
        numMap.put("Fahim" ,9);

        System.out.println(numMap);

        // Cannot have a NULL KEY
        numMap.put(null,11); // EXCEPTION
        System.out.println(numMap); // Null PointerException
    }
}

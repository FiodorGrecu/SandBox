package collectionsFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class DemoLinkedHashMap1 {

    public static void main(String[] args) {


        LinkedHashMap<String,Integer> numMap = new LinkedHashMap<>();

        numMap.put("Fiodor" ,7);
        numMap.put("Charlene" ,17);
        numMap.put("Ehtesham" ,77);
        numMap.put("Issam" ,34);
        numMap.put("Brian" ,3);
        numMap.put("Fahim" ,9);

        // LinkedHashMap keeps insertion order
        System.out.println("LinkedHashMap keeps insertion order");
        System.out.println(numMap);

        System.out.println("***********");

        HashMap<String, Integer> numMap2 = new HashMap<>();

        numMap2.put("Fiodor" ,7);
        numMap2.put("Charlene" ,17);
        numMap2.put("Ehtesham" ,77);
        numMap2.put("Issam" ,34);
        numMap2.put("Brian" ,3);
        numMap2.put("Fahim" ,9);

        // HashMap does not keep insertion order
        System.out.println("HashMap does not keep insertion order");
        System.out.println(numMap2);

    }
}

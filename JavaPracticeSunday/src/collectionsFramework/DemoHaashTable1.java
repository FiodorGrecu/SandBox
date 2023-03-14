package collectionsFramework;

import java.util.Hashtable;
import java.util.TreeMap;

public class DemoHaashTable1 {

    public static void main(String[] args) {

        Hashtable<String, Integer> numMap = new Hashtable<>();

        numMap.put("Fiodor" ,7);
        numMap.put("Charlene" ,17);
        numMap.put("Ehtesham" ,77);
        numMap.put("Issam" ,34);
        numMap.put("Brian" ,3);
        numMap.put("Fahim" ,9);

        System.out.println(numMap);

//        numMap.put(null,3333); // error

        numMap.put("john",null); //ERROR
        System.out.println(numMap);
    }
}

package collectionsFramework;

import java.util.HashMap;

public class DemoHashMap {

    public static void main(String[] args) {


        HashMap<String, String> countryMap = new HashMap<>();

        // to add value we use put()
        countryMap.put("VA" ,"Virginia");
        countryMap.put("MD" ,"Maryland");
        countryMap.put("TX" ,"Texas");
        countryMap.put("FL" ,"Florida");

        System.out.println(countryMap);

        // duplicate key
        countryMap.put("TX" ,"Texas"); // it will override
        countryMap.put("FL" ,"SQL");   // it will override
        System.out.println(countryMap);

        countryMap.put("CO" ,"Java");   // it doesn't matter, we can have dupicate value
        countryMap.put("DE" ,"Java");   // 1 or more keys can have the same value
        System.out.println(countryMap);

        // null key  --> we ca only have one null key
        countryMap.put(null, "Practice");
        countryMap.put(null, "Day 40 ");
        System.out.println(countryMap);

        // null value --> we can have multiple values
        countryMap.put("SD", null);
        countryMap.put("ND", null);
        System.out.println(countryMap);

        // size
        System.out.println("Size: " + countryMap.size());

    }
}

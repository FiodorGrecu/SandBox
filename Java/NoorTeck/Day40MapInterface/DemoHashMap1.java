import java.util.HashMap;

public class DemoHashMap1 {

    public static void main(String[] args) {

        HashMap<String, String> stateMap = new HashMap<String, String>();

        // to add values we use PUT method
        stateMap.put("VA ", " Virginia");
        stateMap.put("NY ", " New York");
        stateMap.put("NJ ", " New Jersey");
        stateMap.put("TX ", " Texas");
        stateMap.put("CA ", " California");

        System.out.println(stateMap);

        // Duplicate key
        stateMap.put("VA ", " Alexandria");
        stateMap.put("VA ", " Arlington");
        System.out.println(stateMap);

        // Duplicate Value
        stateMap.put("CO ", " Colorado");
        stateMap.put("MD ", " Maryland");
        System.out.println(stateMap);

        // null key --> we can only have one null KEY
        stateMap.put(null, "Practice");
        stateMap.put(null, " Day 40");
        System.out.println(stateMap);

        // null value --> we can only have one null KEY
        stateMap.put("IL", null);
        stateMap.put("HI", null);
        System.out.println(stateMap);

        // printing the size of the Object
        System.out.println("Size of this Object is: " + stateMap.size() + " entries.");

        // Capacity is not posible to check Because "capacity is not public method in
        // Map Interface"
        // System.out.println("Capacity of this Object is: " + stateMap.capacity() + "
        // entries.");

    }
}

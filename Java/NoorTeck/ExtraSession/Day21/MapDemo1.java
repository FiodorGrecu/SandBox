import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {

    public static void main(String[] args) {

        Map<Integer, String> mapColor = new HashMap<>();

        mapColor.put(1, "Blue");
        mapColor.put(2, "Red");
        mapColor.put(3, "Green");
        mapColor.put(4, "Gray");
        mapColor.put(5, "Orange");

        System.out.println(mapColor);

        // Getting the number of entries in the map
        System.out.println("The number of entries is: " + mapColor.size());

        // Create a copy of the map in a new map

        // Method 1
        System.out.println("******* Method 1 *******");
        HashMap<Integer, String> newMap1 = new HashMap<Integer, String>(mapColor);
        System.out.println(newMap1);

        // Method 2
        System.out.println("******* Method 2 *******");
        LinkedHashMap<Integer, String> newMap2 = new LinkedHashMap<>();
        newMap2.putAll(newMap1);
        System.out.println(newMap2);

        // Method 3
        System.out.println("******* Method 3 *******");
        LinkedHashMap<Integer, String> newMap3 = new LinkedHashMap<>(newMap2);
        newMap3 = (LinkedHashMap<Integer, String>) newMap2.clone();
        System.out.println(newMap3);

        // Method 3
        System.out.println("******* Method 4 *******");

    }
}

import java.util.*;

public class MapDemo2 {

    public static void main(String[] args) {

        Map<Integer, String> mapColor = new HashMap<>();

        mapColor.put(1, "Red");
        mapColor.put(2, "Green");
        mapColor.put(3, "Black");
        mapColor.put(4, "White");
        mapColor.put(5, "Blue");

        System.out.println(mapColor.containsValue("Red"));
        System.out.println(mapColor.containsKey(1));

    }

}

package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap5 {

    public static void main(String[] args) {

        HashMap<Character, Integer> grade = new HashMap<>();

        grade.put('A', 90);
        grade.put('B', 80);
        grade.put('C', 70);
        grade.put('D', 60);
        grade.put('E', 50);

        // loop through each entry and print the key value
        for (Map.Entry< Character,Integer> entry : grade.entrySet()){
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
            System.out.println("**************");
        }

    }
}

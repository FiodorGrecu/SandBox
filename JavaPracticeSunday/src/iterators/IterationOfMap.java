package iterators;

import java.util.*;

public class IterationOfMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "abc1");
        map.put(2, "abc2");
        map.put(3, "abc3");

        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
        for(int i=keys.size()-1; i>=0;i--){
            System.out.println(map.get(keys.get(i)));
        }

    }
}

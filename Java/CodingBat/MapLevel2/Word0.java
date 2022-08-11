package MapLevel2;

import java.util.*;

public class Word0 {

    public static void main(String[] args) {

        String[] list = { "a", "b" };
        String[] list1 = { "a", "b", "c" };
        String[] list2 = { "a", "b", "c", "d" };

        word0(list);
        word0(list1);
        word0(list2);

    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }
        System.out.println(map);
        return map;
    }

    // public static Map<String, Integer> wordLen(String[] strings) {

    // Map<String, Integer> map = new HashMap<String, Integer>();

    // for (int i = 0; i < strings.length; i++) {

    // map.put(strings[i], strings[i].length());

    // }

    // return map;

    // }

}

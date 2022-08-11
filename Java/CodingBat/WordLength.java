
import java.util.*;

public class WordLength {
    public static void main(String[] args) {
        String[] strings = { "a", "bb", "a", "bb" };
        String[] strings1 = { "this", "and", "that", "and" };
        String[] strings2 = { "code", "code", "code", "bug" };

        wordLen(strings);
        wordLen(strings1);
        wordLen(strings2);
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }

        System.out.println(map);
        return map;
    }

}

package codingInterview;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetFirstNonUniqueChar {

    // get first non-unique character
    // String s = "Test"; --> letter T

    public static void main(String[] args) {

        String string = "Test";
        char result = getUniqueCharacter(string);
        System.out.println("First non repeated char is: " + result);
    }

    public static Character getUniqueCharacter(String str) {
        Map<Character, Integer> strMap = new LinkedHashMap<>();

        for (Character ch : str.toCharArray()) {
            strMap.put(ch, strMap.containsKey(ch) ? strMap.get(ch) + 1 : 1);
        }
        return strMap.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey();

    }
}

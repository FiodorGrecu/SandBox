import java.util.LinkedHashMap;

import java.util.*;

class DuplicateCharacterInAString {

    // Write a java program to find the duplicate characters in a string?
    public static void main(String[] args) {

        // String str = "JavaSelenium"; // teste case 1
        String str = "JavaandSeleniumissofun"; // test case 2

        // Step 1. Turn string into a strArray (Array of characters)
        char[] strArray = str.toCharArray();

        // Step 2. Create a Linked Hash Map to keep track of each element in the string
        // where Key is the character Type
        // where Value is the integer Type
        LinkedHashMap<Character, Integer> strMap = new LinkedHashMap<>();

        // Step 3 loopthrought the string array and while iterating through
        // we need a logic to checi if it contains the character
        // 1. If it DOES NOT exist add the map then add it to the map and set the value
        // to 1
        // 2. If it does exist in the map update incermenting by 1
        //

        for (int i = 0; i < strArray.length; i++) {

            // Step 4. Assigning a variable naemd key of Character type and gining the value
            // of
            // the elemnt in the array of strings.
            Character key = strArray[i];

            // If the character is not in the map, we do part 1 of step 3
            if (!strMap.containsKey(key)) {
                // adding the step 1of 3 here
                strMap.put(key, 1);
            } else {
                // If the character is in the map
                // we increment the value by 1
                // but fist we have to keep track of the current value in the
                int currentValue = strMap.get(key);
                // Now we create a vaariable for the updated value
                int updatedValue = currentValue + 1;

                // and finaly updating the Map value of
                strMap.put(key, updatedValue);

            }

        }

        // Here we can simply print the map to see the entries
        System.out.println(strMap);

        /*
         * Step 4
         * To find the duplicate character whe need to loop throught the map and
         * in the body check if the value equals to 2 then print the entry
         * if not just symply ignore the entry
         * 
         */
        for (Map.Entry<Character, Integer> entry : strMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            // checking the above condition in the step 4
            if (value == 2) {
                System.out.println(key + " : " + value);
            }

            // checking the above condition in the step 4 but for triple character repeated
            // if (value == 3) {
            // System.out.println(key + " : " + value);
            // }
        }

    }

}
/**
 * String str = "JavaProgramPNG"
 * 
 * --> a : 2 --> e : 2
 * 
 *
 */
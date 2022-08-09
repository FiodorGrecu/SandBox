import java.util.*;

public class IsAnagram {
    /**
     * 11. Write a java program to check whether two strings are anagram or not?
     * a. If two strings contain same set of characters but in different order, then
     * the two
     * strings are called anagrams
     */

    public static void main(String[] args) {

        // String str1 = "listen";
        // String str2 = "silent";

        System.out.println(isAnagrams("civic", "vicci"));
        System.out.println(isAnagrams("now", "won"));
        System.out.println(isAnagrams("not", "won"));
    }

    // Step 1. Creating a method with boolean return type that takes 2 String
    // parameters
    public static boolean isAnagrams(String wordA, String wordB) {
        // Step 2. Creating a variable named result and initializing it to false
        boolean result = false;

        // Step 3. Check if the length of the 2 strings are equalthen apply the logic
        // otherwise return false right the way
        if (wordA.length() == wordB.length()) {

            // Step 4. Convert both string to char array using toCharArray() built in method
            char[] arrWordA = wordA.toCharArray();
            char[] arrWordB = wordB.toCharArray();

            // One approach is to sort the 2 arrays and then compare them to each other
            // but this is going to just visually make them equal.
            // in the background they will be stored diferently and the values of
            // the 2 arrays is going to be different so will result to false.

            // Arrays.sort(arrWordA);
            // Arrays.sort(arrWordB);
            // System.out.println(arrWordA); // eilnst
            // System.out.println(arrWordB); // eilnst
            // System.out.println(arrWordA.equals(arrWordB));

            // Another Aproach would be to create two LIST OBJECTS and store the values of
            // the Arrays
            ArrayList<Character> listA = new ArrayList<>();
            ArrayList<Character> listB = new ArrayList<>();

            // Step 1. Iterate through each ArrayList and add values into lists
            for (Character c : arrWordA) {
                listA.add(c);
            }
            for (Character c : arrWordB) {
                listB.add(c);
            }
            // Step 2. Use the builtInn Collections method to sort elements in the lists
            Collections.sort(listA);
            Collections.sort(listB);

            // Step 3 Compare the 2 new lists of elements and if they are equal,
            // return true;
            if (listA.equals(listB)) {
                result = true;
            }

        }

        return result;
    }

}

public class IsAnagram {
    /**
     * 11. Write a java program to check whether two strings are anagram or not?
     * a. If two strings contain same set of characters but in different order, then
     * the two
     * strings are called anagrams
     */

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

        }

        return result;
    }
}

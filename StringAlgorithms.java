public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        int length = word.length();
        String newString = "";
        int n = 0;
        while (n < length) {
        newString = newString + word.substring(n, n + 1) + "\n";
        n += 1;
        }
        return newString;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        int length = word.length();
        int n = length - 1;
        String newString = "";
        while (n >= 0){
        newString = newString + word.substring(n, n + 1);
        n -= 1;
        }
        
        return newString;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
//    public static String capitalizeString(String sentence) {
//        // TODO: Implement this method
//        return "";
//    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        word = word.substring(0, 1).toLowerCase() + word.substring(1);
        int length = word.length();
        int n = length - 1;
        String newString = " \n";
        while (n >= 0){
        newString = newString + word.substring(n, n + 1);
        n -= 1;
        }
        if (newString.equals(" \n" + word)) {
        return true;
        }

        
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
//   public static char firstUniqueChar(String word) {
//        // TODO: Implement this method
//        return ' ';
//    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method

        System.out.println(printCharacters("hello"));
        // Example:
        // System.out.println(printCharacters("hello"));

        System.out.println(reverseWord("hello"));
        // Example:
        // System.out.println(reverseWord("hello"));

//        System.out.println("\nTesting capitalizeString:");
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));

        System.out.println(detectPalindrome("racecar"));
        System.out.println(detectPalindrome("Racecar"));
        System.out.println(detectPalindrome("Java"));
        // Example:
        // System.out.println(detectPalindrome("racecar"));

//        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
    }
}

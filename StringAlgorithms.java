public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
         String letter = "";
         String chars = "";
         for (int i = 0; i < word.length(); i++) {
            letter = word.substring(i, i + 1);
            chars = chars + letter + "\n";
            letter = "";
         }
        return chars;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String droW = "";
      String letter = "";
      int length = word.length();
      for (int i = length; i > 0; i--) {
         letter = word.substring(i - 1, i);
         droW = droW + letter;
         letter = "";
      }
        return droW;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        String capLetter = sentence.substring(0,1);
        String newSentence = capLetter.toUpperCase() + sentence.substring(1);
        while (sentence.indexOf(" ") != -1) {
         capLetter = sentence.substring(sentence.indexOf(" ") + 1, sentence.indexOf(" ") + 2);
         newSentence = newSentence.substring(0, sentence.indexOf(" ") + 1) + capLetter.toUpperCase() + sentence.substring(sentence.indexOf(" ") + 2);
         sentence = sentence.substring(0, sentence.indexOf(" ")) + "*" + sentence.substring(sentence.indexOf(" ") + 1);
         }
        return newSentence;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        System.out.println(printCharacters("hello"));
        // Example:
        // System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord; ");
        // Example:
        // System.out.println(reverseWord("hello"));
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        System.out.println(capitalizeString("the quick brown fox"));
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        // System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
    }
}

package string_problems;

public class Anagram {



    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args){
        System.out.println(isAnagram("CAT", "ACT"));
    }
    public static boolean isAnagram (String first_sentence, String second_sentence){
        int first_length = first_sentence.length();
        int second_length = second_sentence.length();

        if(first_length != second_length){
            return false;
        }

        first_sentence = first_sentence.toLowerCase();
        second_sentence = second_sentence.toLowerCase();

        int[] char_frequencies = new int[26];

        for(int i = 0; i < first_length; i++){
            char current_char = first_sentence.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]++;
        }

        for(int i = 0; i < second_length; i++){
            char current_char = second_sentence.charAt(i);
            int index = current_char - 'a';
            char_frequencies[index]--;
        }

        for(int i = 0; i < 26; i++){
            if(char_frequencies[i] != 0){
                return false;
            }
        }
        return true;
    }

}

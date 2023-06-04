package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        String word = "RACECAR";
        System.out.println(isPalindrome(word));

    }

    // Implement here
    public static boolean isPalindrome(String word){
        int start_point = 0;
        int end_point = word.length()-1;

        while(start_point <= end_point){
            if(word.charAt(start_point) != word.charAt(end_point)){
                return false;
            }
            start_point++;
            end_point--;
        }
        return true;
    }


}

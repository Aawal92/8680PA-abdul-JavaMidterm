package string_problems;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {
        String inputString = "ABC";
        printPermutaions(inputString, "");

    }
    // Implement Here
    public static void printPermutaions(String input, String result){
        if(input.length() == 0){
            System.out.println(result + " ");
            return;
        }
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            String rest = input.substring(0, i) + input.substring(i+1);
            printPermutaions(rest, result + ch);
        }
    }
}

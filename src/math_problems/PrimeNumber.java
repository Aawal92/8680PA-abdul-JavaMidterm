package math_problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {

        /*
        List<Integer> primeNumbers = new ArrayList<>();
        int number = 10;

        for(int i = 2; i <= number; i++){
            boolean isPrime = true;

            for(int j = 2; j <= number /2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers.add(i);
            }
        }
        System.out.println("The prime numbers are : ");
        for(int primeNumber : primeNumbers){
            System.out.println(primeNumber);
        }

         */

        int number = 1000000;

        boolean isPrime = true;

        for(int i = 2; i <= number; i++){
            int sqrt = (int) Math.sqrt(i);

            for(int j = 2; j <= sqrt; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
            isPrime = true;
        }
    }

}

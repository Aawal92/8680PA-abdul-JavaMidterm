package string_problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
        String[] words = st.split(" ");

        Map<String, Integer> sw = new HashMap<>();

        for(String word : words){
            if(sw.get(word) == null){
                sw.put(word, 1);
            }else{
                sw.put(word, sw.get(word) + 1);
            }
        }
        Iterator<String> itr = sw.keySet().iterator();
        while (itr.hasNext()){
            String temp = itr.next();

            if(sw.get(temp) > 1){
                System.out.println(temp + " : " + sw.get(temp));
            }

        }

    }

}

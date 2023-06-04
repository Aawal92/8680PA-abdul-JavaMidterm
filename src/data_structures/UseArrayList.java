package data_structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UseArrayList {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use an ArrayList that includes using the add, peek, remove & retrieve methods.
     * Use For-Each loop and While-loop with Iterator to retrieve the data.
     *
     * Store and retrieve the data from/to a database table.
     */

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("PA");
        states.add("NYC");
        states.add("NJ");
        states.add("BOSTON");
        states.add("LA");
        states.remove("NJ");

        System.out.println(states.get(0));

        // retrieve using For - Each loop
//        for(int i = 0; i < states.size(); i++){
//            System.out.println(states.get(i));
//        }

        // retrieve using while loop
        int count = 0;
        while(states.size() > count){
            System.out.println(states.get(count));
            count++;
        }


        // retrieve using inhance for loop
//        for(String state : states){
//            System.out.println(state);
//        }




    }

}

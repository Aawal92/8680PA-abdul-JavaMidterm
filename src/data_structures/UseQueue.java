package data_structures;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    /** INSTRUCTIONS
     *
     * Demonstrate how to use Queue that includes add, peek, remove & poll methods.
     * Use For-Each loop and While-Loop with Iterator to retrieve data.
     *
     * Store and retrieve data from/to a database table.
     */


    public static void main(String[] args) {

        Queue<String> states = new LinkedList<>();
        states.add("PA");
        states.add("NYC");
        states.add("NJ");
        states.add("BOSTON");
        states.add("LA");
        states.peek();
        states.poll();
        states.remove();

//        for(String state : states){
//            System.out.println(state);
//        }

        Iterator<String>itr = states.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }




    }

}

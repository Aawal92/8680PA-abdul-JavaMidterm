package data_structures;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CollectionView {

    /** INSTRUCTIONS
     *
     * A map is given to you below, with some data inserted into it.
     *
     * Retrieve the Collection view of the values present in map
     */

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        map.put(2, "LA");
        map.put(4, "Boston");
        map.put(1, "NYC");
        map.put(3, "Denver");

        Collection<String> states = map.values();
        for(String state : states ){
            System.out.println(state);
        }

//        Set<Integer> states = map.keySet();
//        for(Integer state : states){
//            System.out.println(map.get(states));
//        }

    }

}

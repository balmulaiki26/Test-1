
package Test;


import java.util.*;


public class Map {

    public static void main(String[] args) {

/*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        HashMap<Integer, String> Map = new HashMap<>();
        Map.put(45, "Queens");
        Map.put(50, "Brooklyn");
        Map.put(60, "Manhattan");
        Map.put(70, "Staten Island");

        Map<String, List<string>> list = new HashMap<String, List<String>>();


        for (int i=0;i< List.size();i++){
            System.out.println(List.get(i)+" ");
        }
        System.out.println("");


        Iterator it = UseMap.iterator();
        while (it.hasNext()){
            System.out.println(it.next());



    }

    }
}


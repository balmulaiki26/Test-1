
package Test;


import java.util.*;




public class UseMap {

    public static void main(String[] args) {

        Map<String, List<String>> list = new HashMap<>();

        List<String> listOfStateOfUSA = new ArrayList<>();
        List<String> listOfStateOfCanada = new ArrayList<>();

        listOfStateOfCanada.add("Ontario");
        listOfStateOfUSA.add("NewYork");
        listOfStateOfUSA.add("New Jersey");
        listOfStateOfCanada.add("Montreal");

        list.put("USA", listOfStateOfUSA);
        list.put("Canada", listOfStateOfCanada);


        System.out.println(list.size());
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println("");



        }
    }


//*//



       /*  * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         *
*/

        /*HashMap<Integer, String> Map = new HashMap<>();
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
}*/



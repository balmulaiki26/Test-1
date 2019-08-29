package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        ArrayList<String>fruitList=new ArrayList<>();
         //add
         fruitList.add("Apple");
         fruitList.add("Watermelon");
         fruitList.add("Strawberry");
         fruitList.add("Orange");
        System.out.println(fruitList);
         //remove
         fruitList.remove("Orange");
        System.out.println(fruitList);

        //retrieve elements
        Object element = fruitList.get(0);
        System.out.println("First element:" + element);

        //Loop
        for (int i=0;i<fruitList.size();i++){
            System.out.println(fruitList.get(i)+" ");
        }
        System.out.println("");



         //Iterator

        Iterator it = fruitList.iterator();
        while (it.hasNext())
            System.out.println(it.next());



    }

}

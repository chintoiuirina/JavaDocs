package exercise.exercise0;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Radu.Hoaghe on 4/20/2015.
 * <p/>
 * Exercise 0: Create a List (ArrayList or LinkedList), add elements to it and print all of them using ListIterator
 * for loop and foreach loop.
 */
public class Exercise0 {


    public Exercise0() {}

    public void iterateThroughList() {   //ctrl+alt+l=> indentare: aliniere

        // TODO Exercise #0 a) Create a list (ArrayList or LinkedList) and add elements to it

        ArrayList<String> array = new ArrayList<String>();
        array.add("hey!");
        array.add("bine!");
        array.add("Te descurci minunat:d");
        // TODO Exercise #0 a) Hint: Don't forget to specify the type of the list (Integer, String etc.)


        // TODO Exercise #0 b) Iterate through the list using ListIterator and print all its elements

        ListIterator<String> li = array.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());

        }


        // TODO Exercise #0 c) Iterate through the list using classic for loop and print all its elements
        for (int i = 0; i < array.size(); i++)

        {
            System.out.println(array.get(i));
        }


        // TODO Exercise #0 d) Iterate through the list using foreach loop and print all its elements

        for (String item : array) {  // tip clasa item: lista
            System.out.println(item);

        }
    }

    public static void main(String[] args) {
        // TODO Exercise #0 e) Create a new instance of Exercise0 class and call the iterateThroughList() method
        Exercise0 ex=new Exercise0();
        ex.iterateThroughList();

    }
}

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //Here I created  a Empty Set.


        Set set = Collections.emptySet();


        set.add("Vinod");
        set.add("Tusar");
        set.add("Gaurav");
        set.add("Jatin");


        // now, I'm displaying the Set..
        System.out.println("Before the Set: " + set);

        // here, I Removing elements using remove() method
        set.remove("Vinod");
        set.remove("Gaurav");


        // now, Displaying the Set after removal
        System.out.println("Set after removing elements: "
                + set);
        //Finally I show the size of the set....
        System.out.println("The size of the set is: " + set.size());

    }
}

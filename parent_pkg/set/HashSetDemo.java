package parent_pkg.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Gauhar");
        hs.add("Ahmar");
        hs.add("Ahsan");
        hs.add("Gauhar"); //and see when we want to try to add the elements into the existing set then it will not store into it.
        System.out.println("set is : " + hs);

        //we used iterator interface to retrieve the elements into the set
        Iterator it = hs.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
        }
    }
}

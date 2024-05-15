package parent_pkg.list;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);


        System.out.println("List is : " + al);
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

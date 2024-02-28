package parent_pkg.list;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) throws Exception{
        LinkedList<String> ll = new LinkedList<>();
        //we have to add some element into linked list
        ll.add("Gauhar");
        ll.add("Ahsan");
        ll.add("Nawab");
        //print the linked list
        System.out.println("List : " + ll);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int position;
        String elements;
        int choice = 0;


        while (choice < 4){

            System.out.println("LINKED LIST OPERATION");
            System.out.println("1 Add an Element : ");
            System.out.println("2 Remove an Element : ");
            System.out.println("3 Change an Element : ");
            System.out.println("4 Exit");
            System.out.print("Your Choice : ");

            choice = Integer.parseInt(br.readLine());

            switch (choice){

                case 1:
                    System.out.print("Enter an Element : ");
                    elements = br.readLine();
                    System.out.print("At What position ? ");
                    position = Integer.parseInt(br.readLine());
                    ll.add(1,elements);
                    break;

                case 2:
                    System.out.print("Enter Position : ");
                    position = Integer.parseInt(br.readLine());
                    ll.remove(1);
                    break;

                case 3:
                    System.out.print("Enter Position : ");
                    position = Integer.parseInt(br.readLine());
                    System.out.print("Enter new Element : ");
                    elements = br.readLine();
                    ll.set(1,elements);
                    break;

                default:
                    return;
            }
            //use iterator to retrive the elements
            System.out.print("List = ");
            Iterator it = ll.iterator();
            while (it.hasNext()){
                System.out.print(it.next() + " ");
            }
        }
    }
}

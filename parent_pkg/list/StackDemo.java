package parent_pkg.list;
import java.io.*;
import java.util.*;
public class StackDemo {

    public static void main(String[] args) throws Exception {
        //create stack
        Stack<Integer> st = new Stack<>();
        //take variables
        int choice = 0;
        int position;
        int elements;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (choice < 4){
            System.out.println("STACK OPERATION");
            System.out.println("1 push an element : ");
            System.out.println("2 pop an element : ");
            System.out.println("3 search an element : ");
            System.out.println("4 Exit");
            System.out.print("Your choice : ");

            choice = Integer.parseInt(br.readLine());

            switch (choice){
                case 1:
                    System.out.print("Push an Element :- ");
                    elements = Integer.parseInt(br.readLine());
                    st.push(elements);
                    break;

                case 2:
                    Integer obj = st.pop();
                    System.out.println("Popped Element :- " + obj);
                    break;

                case 3:
                    System.out.print("Which element you want to search? ");
                    elements = Integer.parseInt(br.readLine());
                    position = st.search(elements);
                    if (position == -1){
                        System.out.println("Element not found");
                    }else {
                        System.out.println("position :- " + position);
                    }
                    break;
                default:
                    return;
            }
            System.out.println("Stack elements :- " + st);
        }
    }
}

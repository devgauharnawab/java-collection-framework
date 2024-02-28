package parent_pkg.set;
import java.io.*;
public class Employee {
    //make instance variables
    int id;
    String name;
    //make constructor
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    //make method to display the data
    void display(){
        System.out.println(id + "\t" + name);
    }
}
class Group{
    public static  void main(String[] args) throws Exception {
        //to scan data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //create Employee with array size 5
        Employee[] emp = new Employee[5];
        for (int i = 0; i < 5; i++){
            System.out.println("Enter Id : ");
            int id = Integer.parseInt(br.readLine());

            System.out.println("Enter name : ");
            String name = br.readLine();

            emp[i] = new Employee(id,name);
        }
        System.out.println("\n Display the Employee Data :  ");
        for (int i = 0; i < emp.length; i++){
            emp[i].display();
        }
    }
}


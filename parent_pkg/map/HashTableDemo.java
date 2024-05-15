package parent_pkg.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args)throws IOException {
        //create Hash Table
        Hashtable<String,Integer> ht = new Hashtable<>();
        //put the elements into it
        ht.put("Gauhar Nawab" , 10);
        ht.put("Aamir Naved", 20);
        ht.put("Affan Ahmad Siddiqui", 30);
        ht.put("Yousuf Sultan", 40);
        ht.put("Ali Saad Khan", 50);
        ht.put("Ankit Kumar Gupta", 60);

        System.out.println("The Player Names is : ");
        Enumeration et = ht.keys();
        while (et.hasMoreElements()){
            System.out.println(et.nextElement());
        }

        //accept player name for buffer keyword
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Player Name : ");
        String name =  br.readLine();
        //remove unnecessary spaces
        name = name.trim();
        //get score of the player by name
        Integer score = ht.get(name);
        if (score != null){
            //remove Integer to int
            int sc = score.intValue();
            System.out.println(name + " Scored = " + sc);
        }else{
            System.out.println("Player not Found!");
        }
    }
}

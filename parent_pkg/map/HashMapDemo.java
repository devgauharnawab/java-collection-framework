package parent_pkg.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) throws IOException {
        // create hash map
        HashMap<String, Long> hm = new HashMap<>();
        // vars
        String name, str;
        long phone_no;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // menu
        while (true) {
            System.out.println("1 : Enter Phone Entries");
            System.out.println("2 : Enter Phone LookUp");
            System.out.println("3 : Display names in Book");
            System.out.println("4 : Exit");

            System.out.print("Enter Your Choice: ");
            int n = Integer.parseInt(br.readLine());

            switch (n) {
                case 1:
                    System.out.print("Enter Name: ");
                    name = br.readLine().trim();
                    System.out.print("Enter Phone No: ");
                    str = br.readLine();
                    try {
                        phone_no = Long.parseLong(str);
                        hm.put(name, phone_no);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid phone number format. Please enter a valid number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Name: ");
                    name = br.readLine().trim();
                    // check if the name exists in the HashMap
                    if (hm.containsKey(name)) {
                        phone_no = hm.get(name);
                        System.out.println("Phone No: " + phone_no);
                    } else {
                        System.out.println("Name not found in the phone book.");
                    }
                    break;

                case 3:
                    // display names in the phone book
                    Set<String> nameSet = hm.keySet();
                    System.out.println("Names in the Phone Book: " + nameSet);
                    break;

                case 4:
                    return;
            }
        }
    }
}

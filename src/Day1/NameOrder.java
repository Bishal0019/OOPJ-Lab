package Day1;

import java.util.Scanner;

public class NameOrder {

    String takeName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

    void displayBothName(String First, String Second){
        System.out.println(Second+" "+First);
    }

    public static void main(String[] args){
        NameOrder n = new NameOrder();
        String First, Last;
        System.out.println("Enter First Name: ");
        First = n.takeName();
        System.out.println("Enter Last Name: ");
        Last = n.takeName();

        n.displayBothName(First,Last);
    }
}

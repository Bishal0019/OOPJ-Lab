package Day3;

import java.util.Scanner;

class Account {
    int acc_no;
    float balance;

    void input(Scanner sc){
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextFloat();
    }

    void display(){
        System.out.println("Account Number = "+acc_no+"\nBalance = "+balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;

    void input(Scanner sc){

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextInt();

        super.input(sc);

        sc.nextLine();
    }

    void display(){
        System.out.println("Name = "+name+"\nAadhar Number = "+aadhar_no);
        super.display();
    }
}

public class PersonDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];

        for(int i=0; i<3; i++){
            System.out.println("\nEnter Details for Person "+(i+1));
            p[i] = new Person();
            p[i].input(sc);
        }

        for(int i=0; i<3; i++){
            System.out.println("\nDisplaying Details for Person "+(i+1));
            p[i].display();
        }
    }
}

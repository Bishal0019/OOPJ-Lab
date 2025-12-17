package Day2;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;

    Student (int roll, String name, float cgpa){
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.println("Roll = "+roll);
        System.out.println("Name = "+name);
        System.out.println("CGPA = "+cgpa+"\n");
    }
}

public class StudentDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];

        for(int i=0;i<n;i++){
            System.out.println("\nEnter Values for Student "+(i+1)+":");
            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            float cgpa = sc.nextFloat();

            s[i] = new Student(roll,name,cgpa);
        }

        System.out.println("\nDisplaying Student Details\n");

        for(int i=0;i<n;i++){
            s[i].display();
        }

        Student lowest = s[0];
        for(int i=1;i<n;i++){
            if(s[i].cgpa< lowest.cgpa){
                lowest = s[i];
            }
        }

        System.out.println("\nStudent With The Lowest CGPA: ");
        lowest.display();
    }
}

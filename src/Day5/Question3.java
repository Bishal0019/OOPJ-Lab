package Day5;

import java.util.Scanner;

interface Employee{
    void getDetails();
}

interface manager extends Employee{
    void getDeptDetails();
}

class head implements manager{
    int emp_id;
    String emp_name,dept_name,dept_id;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id - ");
        emp_id=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter employee name - ");
        emp_name=sc.nextLine();
    }

    public void getDeptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department id - ");
        dept_id=sc.nextLine();

        System.out.print("Enter department name - ");
        dept_name=sc.nextLine();
    }

    void display(){
        System.out.println("Employee id - "+emp_id);
        System.out.println("Employee name - "+emp_name);
        System.out.println("Department id - "+dept_id);
        System.out.println("Department name - "+dept_name);
    }
}

public class Question3 {
    public static void main(String[] args){
        head h = new head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}

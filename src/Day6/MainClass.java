package Day6;

import Day6.Marketing.sales;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id and employee name ");
        int empid = sc.nextInt();
        String ename = sc.next();
        System.out.print("Enter the basic salary ");
        double basic = sc.nextDouble();

        sales s = new sales(empid,ename,basic);
        System.out.println("Employee id of the employee is "+empid);
        System.out.println("The total earning is "+s.earnings());
    }
}

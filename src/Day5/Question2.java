package Day5;

import java.util.Scanner;

interface salary{
    void earnings();
    void deductions();
    void bonus();
}

abstract class Manager implements salary{
    double basic;

    Manager(double basic){
        this.basic=basic;
    }

    public void earnings(){
        double DA = 0.8*basic;
        double HRA = 0.15*basic;
        //basic=basic+DA+HRA;
        System.out.println("Total Extras - "+(DA+HRA));
    }

    public void deductions() {
        double PF = 0.12*basic;
        //basic-=PF;
        System.out.println("Deduction - "+PF);
    }
}

class Substaff extends Manager{

    Substaff(Scanner sc){
        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();
        super(salary);
    }

    public void bonus(){
        double bonus = 0.5*basic;
        //basic+=bonus;
        System.out.println("Bonus - "+bonus);
    }
}

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Substaff sb = new Substaff(sc);
        sb.earnings();
        sb.deductions();
        sb.bonus();
    }
}

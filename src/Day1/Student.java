package Day1;

public class Student {
    String name = "Bishal Pal";
    int roll = 2405344;
    String section = "CSE-20";
    String branch = "CSE";

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Section: "+section);
        System.out.println("Branch: "+branch);
    }

    public static void main(String[] args){
        Student s = new Student();
        s.displayDetails();
    }
}

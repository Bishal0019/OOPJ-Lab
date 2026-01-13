package Day4;

abstract class student{
    int roll_no,reg_no;

    void getInput(int roll_no, int reg_no){
        this.roll_no=roll_no;
        this.reg_no=reg_no;
    }

    void display(){
        System.out.println("Rollno - "+roll_no);
        System.out.println("Registration no - "+reg_no);
    }

    abstract void course();
}

class kittian extends student{
    void course(){
        System.out.println("Course - B.Tech. (Computer Science & Engg");
    }
}

public class Question2 {
    public static void main(String[] args){
        student s1;

        s1 = new kittian();

        s1.getInput(2205180,1234567890);
        s1.display();
        s1.course();
    }
}

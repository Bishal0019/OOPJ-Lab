package Day1;

public class Grading {
    int OOPJ_Lab = 82;

    char Grades(){
        int pointer = (OOPJ_Lab/10)+1;
        if(pointer==10) return 'O';
        else if(pointer==9) return 'E';
        else if(pointer==8) return 'A';
        else if(pointer==7) return 'B';
        else if(pointer==6) return 'C';
        else if(pointer==5) return 'D';
        else return 'F';
    }

    public static void main(String[] args){
        Grading g = new Grading();
        char Grade = g.Grades();
        System.out.println("Your Grade = "+Grade);
    }
}

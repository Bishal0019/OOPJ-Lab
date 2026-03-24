package Day7;
import java.util.Scanner;

class ArithmeticTryCatch{
    int a,b;

    ArithmeticTryCatch(Scanner sc){
        System.out.print("Enter Value for a: ");
        a = sc.nextInt();
        System.out.print("Enter Value for b: ");
        b = sc.nextInt();

        try{
            int n = a/b;
            System.out.println("Result = "+n);
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }finally {
            System.out.println("Finally Block Executed");
        }
    }
}

public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArithmeticTryCatch atc = new ArithmeticTryCatch(sc);
        sc.close();
    }
}

package Day7;
import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(String message){
        super(message);
    }
}

class userException{
    int n;

    userException(Scanner sc){
        System.out.print("Enter a Number: ");
        n = sc.nextInt();
    }

    void processInput() throws NegativeNumberException{
        if(n<0){
            throw new NegativeNumberException("Exception occurred:  NegativeNumberException: number should be positive");
        }else {
            System.out.println("Double value: "+(n*2));
        }
    }
}

public class Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            userException ue = new userException(sc);
            ue.processInput();
        }catch (NegativeNumberException e){
            System.out.println("Caught the Exception");
            System.out.println(e);
        }
        sc.close();
    }
}

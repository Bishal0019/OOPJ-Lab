package Day7;
import java.util.Scanner;

class AddIntoArray{
    int[] arr = new int[4];
    static int i=0;

    AddIntoArray(int n){
        arr[i]=n;
        i++;
    }
}

public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                System.out.print("Enter Number: ");
                int n = sc.nextInt();
                AddIntoArray a = new AddIntoArray(n);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                break;
            }
        }
        sc.close();
    }
}

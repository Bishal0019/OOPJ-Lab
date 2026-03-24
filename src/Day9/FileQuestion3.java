package Day9;
import java.util.Scanner;
import java.io.*;

class compare{
    String file1,file2;

    compare(Scanner sc){
        System.out.print("Enter File 1 Name: ");
        file1 = sc.nextLine();

        System.out.print("Enter File 2 Name: ");
        file2 = sc.nextLine();
    }

    void isEqual(){
        try{
            FileInputStream fis1 = new FileInputStream(file1);
            FileInputStream fis2 = new FileInputStream(file2);

            int position = 0;
            int byte1, byte2;
            boolean Equals = true;

            while(true){
                byte1 = fis1.read();
                byte2 = fis2.read();

                if(byte1==-1 && byte2==-1)
                    break;

                position++;

                if(byte1!=byte2){
                    Equals=false;
                    System.out.println("Two Files Differ at Position: "+position);
                    break;
                }
            }

            if(Equals) System.out.println("Both Files Are Same");
        }catch (IOException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}

public class FileQuestion3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        compare c = new compare(sc);
        c.isEqual();
    }
}

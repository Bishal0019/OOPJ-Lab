package Day9;
import java.io.*;
import java.util.Scanner;

class CopyPaste{
    String source, destination;

    CopyPaste(Scanner sc){
        System.out.print("Enter Source File: ");
        source = sc.nextLine();

        System.out.print("Enter Destination File: ");
        destination = sc.nextLine();
    }

    void method1(){
        try{
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);

            int ch;
            while((ch=fr.read())!=-1){
                fw.write(ch);
            }

            fr.close();
            fw.close();
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    void method2(){
        try{
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);

            int ch;
            while((ch=fis.read())!=-1){
                fos.write(ch);
            }

            fis.close();
            fos.close();
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

public class FileQuestion2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        CopyPaste cp = new CopyPaste(sc);
        cp.method1();
        cp.method2();
    }
}

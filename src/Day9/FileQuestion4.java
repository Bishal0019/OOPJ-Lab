package Day9;
import java.util.Scanner;
import java.io.*;

class Count{
    String file;
    int charno = 0;
    String[] word,line;

    Count(Scanner sc){
        System.out.print("Enter File Name: ");
        file = sc.nextLine();
    }

    void CountFile(){
        try{
            FileReader fr = new FileReader(file);

            String fl = fr.readAllAsString();
            for(char ch : fl.toCharArray()){
                charno++;
            }
            word = fl.trim().split("\\s+");
            line = fl.split("\\n");

            System.out.println("Total Characters : "+charno);
            System.out.println("Total Words : "+word.length);
            System.out.println("Total Lines : "+line.length);
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}

public class FileQuestion4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Count c = new Count(sc);
        c.CountFile();
    }
}

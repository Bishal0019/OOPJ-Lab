package Day9;
import java.io.*;
import java.util.Scanner;

public class FileQuestion1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter Student Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String sub = sc.nextLine();

            System.out.print("Enter Student Marks: ");
            float marks = sc.nextFloat();
            sc.nextLine();

            System.out.print("Enter File Name: ");
            String fn = sc.nextLine();

            FileWriter fw = new FileWriter(fn,true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Roll Number: "+roll);
            bw.newLine();
            bw.write("Name: "+name);
            bw.newLine();
            bw.write("Subject: "+sub);
            bw.newLine();
            bw.write("Marks: "+marks);
            bw.newLine();

            bw.close();
            System.out.println("Successfully Written");

            FileReader fr = new FileReader(fn);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("Displaying File Content...");

            while((line=br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();
    }
}

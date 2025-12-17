package Day2;

import java.util.Scanner;

class Calculate {
    float length, breadth;

    Calculate(){
        length = 0;
        breadth = 0;
    }

    Calculate(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea(){
        System.out.println("Area = "+(length*breadth));
    }
}

public class RectangleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculate c1 = new Calculate();

        System.out.print("Enter Length: ");
        float l = sc.nextFloat();

        System.out.print("Enter Breadth: ");
        float b = sc.nextFloat();

        Calculate c2=new Calculate(l,b);
        c2.displayArea();
    }
}

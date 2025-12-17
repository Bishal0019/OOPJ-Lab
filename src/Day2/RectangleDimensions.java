package Day2;

import java.util.Scanner;

class Rectangle {
    float length, breadth;

    Rectangle(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void Area(){
        System.out.println("Area = "+length*breadth);
    }

    void Perimeter(){
        System.out.println("Perimeter = "+2*(length+breadth));
    }
}

public class RectangleDimensions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        float l = sc.nextFloat();

        System.out.print("Enter Breadth: ");
        float b = sc.nextFloat();

        Rectangle r = new Rectangle(l,b);
        r.Area();
        r.Perimeter();
    }
}

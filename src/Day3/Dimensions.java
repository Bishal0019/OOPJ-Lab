package Day3;

import java.util.Scanner;

class Plate {
    float length,breadth;

    Plate(float length, float breadth){
        this.length = length;
        this.breadth = breadth;

        System.out.println("For Plate:");
        System.out.println("Dimensions of Plate are: ");
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth+"\n");
    }
}

class Box extends Plate {
    float height;

    Box(float l, float b, float height){
        super(l,b);
        this.height = height;

        System.out.println("For Box:");
        System.out.println("Dimensions of Plate are: ");
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
        System.out.println("Height = "+height+"\n");
    }
}

class WoodBox extends Box {
    float thick;

    WoodBox(float l, float b, float h, float thick){
        super(l,b,h);
        this.thick = thick;

        System.out.println("For Wooden Box:");
        System.out.println("For Box:");
        System.out.println("Dimensions of Plate are: ");
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
        System.out.println("Height = "+height);
        System.out.println("Thickness = "+thick+"\n");
    }
}

class Dimensions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        float len = sc.nextFloat();

        System.out.print("Enter Breadth: ");
        float bre = sc.nextFloat();

        System.out.print("Enter Height: ");
        float height = sc.nextFloat();

        System.out.print("Enter Thickness: ");
        float thick = sc.nextFloat();

        WoodBox wb = new WoodBox(len,bre,height,thick);
    }
}

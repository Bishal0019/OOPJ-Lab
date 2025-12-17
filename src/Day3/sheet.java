package Day3;

import java.util.Scanner;

class sheet {
    float len,bre;

    sheet(float len,float bre){
        this.len=len;
        this.bre=bre;
    }

    float getArea(){
        return len*bre;
    }

    float getSheetCost(){
        return getArea()*40;
    }
}

class box extends sheet{
    float height;

    box(float l, float b, float height){
        super(l,b);
        this.height=height;
    }

    float getVolume(){
        return getArea()*height;
    }

    float getBoxCost(){
        return getVolume()*60;
    }
}

class PlasticCost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Sheet\n");
        System.out.print("Enter Length: ");
        float length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        float breadth = sc.nextInt();
        sheet s = new sheet(length, breadth);
        System.out.println("Area of Sheet = "+s.getArea());
        System.out.println("Cost of Sheet = "+s.getSheetCost());

        System.out.println("\nFor Box\n");
        System.out.print("Enter Height: ");
        float height = sc.nextInt();
        box b = new box(length,breadth,height);
        System.out.println("Volume of Box = "+b.getVolume());
        System.out.println("Cost of Box = "+b.getBoxCost());
    }
}

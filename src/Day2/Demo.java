package Day2;

import java.util.Scanner;

class Box {
    float length, width, height;

    Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    float volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float l = sc.nextFloat();

        System.out.print("Enter width: ");
        float w = sc.nextFloat();

        System.out.print("Enter height: ");
        float h = sc.nextFloat();

        Box b = new Box(l, w, h);
        System.out.println("Volume = " + b.volume());
    }
}

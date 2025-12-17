package Day2;

class Subtract {

    Subtract(int a, int b){
        System.out.println("Subtracting Two Integers = "+(a-b));
    }

    Subtract(int a, int b, int c){
        System.out.println("Subtracting three Integers = "+(a-b-c));
    }
}

public class SubtractDemo {
    public static void main(String[] args){
        Subtract s1 = new Subtract(10,5);
        Subtract s2 = new Subtract(10,5,3);
    }
}

package Day2;

class countNum {
    int even = 0, odd = 0;

    countNum(String[] args){
        if(args.length!=10){
            System.out.println("Enter Exactly 10 Numbers");
            return;
        }

        for(int i=0; i<args.length; i++){
            int num = Integer.parseInt(args[i]);

            if(num%2 == 0) even++;
            else odd++;
        }

        System.out.println("Even Numbers = "+even);
        System.out.println("Odd Numbers = "+odd);
    }
}

public class EvenOdd {
    public static void main(String[] args){
        countNum cn = new countNum(args);
    }
}

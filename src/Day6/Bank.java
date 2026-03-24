package Day6;

public class Bank {
    static double principal=10000;
    static double interest=0.5;
    static int time=5;

    static class InterestCalculator{
        static double SI(){
            return principal*interest*time;
        }
    }

    public static void main(String[] args){
        InterestCalculator it = new InterestCalculator();
        System.out.println("SI = "+it.SI());
    }
}

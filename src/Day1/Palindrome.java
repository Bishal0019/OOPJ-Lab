package Day1;

import java.util.Scanner;

public class Palindrome {

    int getNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        return sc.nextInt();
    }

    boolean checkPalindrome(int num){
        int org = num;
        int rev = 0;

        while(num != 0){
            int digit = num%10;
            rev=rev*10+digit;
            num/=10;
        }

        if(org == rev) return true;
        else return false;
    }

    public static void main(String[] args){
        Palindrome p = new Palindrome();
        int num = p.getNum();
        if(p.checkPalindrome(num)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}

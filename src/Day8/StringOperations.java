package Day8;
import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // i) Change case & ii) Reverse
        System.out.print("Enter a String: ");
        String s1 = sc.nextLine();
        changeCase(s1);
        reverseString(s1);

        // iii) Compare two strings
        System.out.print("\nEnter the second string for comparision: ");
        String s2 = sc.nextLine();
        compareStrings(s1, s2);

        // iv) Insert string
        System.out.print("\nEnter the string to be inserted into first string: ");
        String insert = sc.nextLine();
        insertString(s1, insert);

        // v) Upper & Lower
        System.out.print("\nEnter a String: ");
        String s3 = sc.nextLine();
        upperLower(s3);

        // vi) Character position
        System.out.print("\nEnter a String: ");
        String s4 = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.nextLine();  // clear buffer
        findCharacter(s4, ch);

        // vii) Palindrome
        System.out.print("\nEnter a String: ");
        String s5 = sc.nextLine();
        checkPalindrome(s5);

        // viii) Word, vowel, consonant
        System.out.print("\nEnter a String: ");
        String sentence = sc.nextLine();
        countWordsVowelsConsonants(sentence);

        sc.close();
    }

    // i) Change Case
    static void changeCase(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                result += Character.toUpperCase(c);
            else
                result += c;
        }
        System.out.println("The string after changing the case is " + result);
    }

    // ii) Reverse
    static void reverseString(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("The string after reversing is " + rev);
    }

    // iii) Compare ASCII difference
    static void compareStrings(String s1, String s2) {
        int sum1 = 0, sum2 = 0;

        for (char c : s1.toCharArray())
            sum1 += c;

        for (char c : s2.toCharArray())
            sum2 += c;

        System.out.println("The difference between ASCII value is " + Math.abs(sum1 - sum2));
    }

    // iv) Insert string
    static void insertString(String s1, String s2) {
        System.out.println("The string after insertion is : " + s1 + " " + s2);
    }

    // v) Upper & Lower
    static void upperLower(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    // vi) Find character
    static void findCharacter(String str, char ch) {
        int pos = str.indexOf(ch);

        if (pos != -1)
            System.out.println("Position of entered character: " + (pos + 1));
        else
            System.out.println("Entered character is not present");
    }

    // vii) Palindrome
    static void checkPalindrome(String str) {
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(rev))
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }

    // viii) Word, vowel, consonant count
    static void countWordsVowelsConsonants(String str) {

        String[] words = str.trim().split("\\s+");
        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("No. of words: " + words.length);
        System.out.println("No. of vowels: " + vowels);
        System.out.println("No. of consonants: " + consonants);
    }
}
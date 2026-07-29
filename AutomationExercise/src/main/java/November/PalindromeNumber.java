package November;

import java.util.Scanner;

public class PalindromeNumber {

    public int number;
    public  int digit = 0;
    public  int reverse = 0 ;

    public PalindromeNumber(int number){
        this.number = number ;
    }

    public boolean isPalindromeNumber(){
        int original = number;
        int temp = number ;
        while (temp > 0){
            digit = temp % 10 ;
            reverse = reverse * 10 + digit ;
            temp = temp / 10 ;
        }
        return original == reverse ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Create an instance of PalindromeNumber with input
        PalindromeNumber palindrome = new PalindromeNumber(num);

        // Call instance method isPalindrome()
        if (palindrome.isPalindromeNumber()) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is NOT a Palindrome number.");
        }

        scanner.close();
    }
}

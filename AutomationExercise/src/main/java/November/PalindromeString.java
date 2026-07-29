package November;

import java.util.Scanner;

public class PalindromeString {

    public String text;
    public Scanner sc;
    public String reverse = "";

    public PalindromeString() {
        sc = new Scanner(System.in);
    }

    public void readText() {
        System.out.println("Enter string :");
        text = sc.nextLine();
    }

    public void reverseByLoop() {
        System.out.println("Actual String : " + text);

        reverse = "";  // reset before reversing

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        System.out.println("Reversed String (Loop): " + reverse);
    }

    public String reverseByMethod() {
        return new StringBuilder(text).reverse().toString();
    }

    public boolean isPalindrome() {
        // Compare text with reverse (ignoring case)
        return text.equalsIgnoreCase(reverse);
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        PalindromeString ps = new PalindromeString();
        ps.readText();

        // Create reversed string using loop
        ps.reverseByLoop();

        // Or reversed using method
        String reversed = ps.reverseByMethod();
        System.out.println("Reversed String (Method): " + reversed);

        // Check palindrome
        if (ps.isPalindrome()) {
            System.out.println("The string IS a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        ps.closeScanner(); // good practice
    }

//.equals()
//.equalsIgnoreCase()
//.contains()
//.replaceAll("\\d", "")
//.split()
//.toUpperCase()
//.toLowerCase()
//.trim()
//.length()
//.charAt()
//.StringBuilder
}

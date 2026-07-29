package November;

import java.util.Scanner;

public class StringReverser {

    public String text;
    public Scanner sc;
    public String reverse = "";

    public StringReverser() {
        sc = new Scanner(System.in);
    }

    public void readText() {
        System.out.println("Enter string :");
        text = sc.nextLine();
    }

    public void reverseByLoop() {
        System.out.println("Actual String : " + text);

        reverse = "";  // FIX: reset before reversing

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        System.out.println("Reversed String (Loop): " + reverse);
    }

    public String reverseByMethod() {
        return new StringBuilder(text).reverse().toString();
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        StringReverser sr = new StringReverser();
        sr.readText();

        // Using loop method
        sr.reverseByLoop();

        // Using built-in method
        String reversed = sr.reverseByMethod();
        System.out.println("Reversed String (Method): " + reversed);

        sr.closeScanner(); // optional good practice
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

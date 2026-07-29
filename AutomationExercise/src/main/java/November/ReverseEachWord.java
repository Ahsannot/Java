package November;

import java.util.Scanner;

public class ReverseEachWord {

    public String word;

    public ReverseEachWord(String word) {
        this.word = word;
    }

    // Reverse a single word
    public String reverseSingleWord(String w) {
        String reversedWord = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            reversedWord += w.charAt(i);
        }
        return reversedWord;
    }

    // Reverse each word in the sentence
    public String reverseEachWord() {
        String[] text = word.split(" ");
        String reversedString = "";

        for (String txt : text) {
            String reversedWord = reverseSingleWord(txt);
            reversedString += reversedWord + " ";
        }
        return reversedString.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        ReverseEachWord rv = new ReverseEachWord(str);

        // Reverse whole sentence
        System.out.println("Full Reverse: " + rv.reverseSingleWord(str));

        // Reverse each word separately
        System.out.println("Each Word Reversed: " + rv.reverseEachWord());

        sc.close();
    }
}

package November;

import java.util.Scanner;

public class RemoveWhiteSpaces {

    public String text;

    public RemoveWhiteSpaces(String text) {
        this.text = text;
    }

    public String normalizeSpaces() {
        return text.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        RemoveWhiteSpaces rws = new RemoveWhiteSpaces(str);

        System.out.println("Original String: " + rws.text);
        System.out.println("String without extra spaces: " + rws.normalizeSpaces());

        sc.close();
    }
}

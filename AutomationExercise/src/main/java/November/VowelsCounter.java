package November;

import java.util.Scanner;

public class VowelsCounter {

    public  String text ;
    public Scanner sc;

    public VowelsCounter(){
        sc = new Scanner(System.in);
    }

    public void readText() {
        System.out.println("Enter string :");
        text = sc.nextLine();
    }

    public void countVowels() {
        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Vowel Count is :" + count);
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        VowelsCounter vc = new VowelsCounter();
        vc.readText();
        vc.countVowels();
        vc.closeScanner();
    }
}

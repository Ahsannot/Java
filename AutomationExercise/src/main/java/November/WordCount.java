package November;

import java.util.Scanner;

public class WordCount {

    public String word ;
    public int wordCount = 0;
    public boolean wordFound = false;

    public WordCount(String word){
        this.word = word ;
    }

    public int getWordCount(){
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);

        if (ch != ' ' && ch != '\n' && ch != '\t'){
            if (!wordFound){
                wordFound = true;
                wordCount++;
            }
        } else {
            wordFound = false;
        }
        }
        return wordCount;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();

        WordCount wc = new WordCount(str);
        int count = wc.getWordCount();
        System.out.println(count);

        sc.close();
    }
}

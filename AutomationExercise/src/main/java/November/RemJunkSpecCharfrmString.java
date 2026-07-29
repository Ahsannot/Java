package November;

import java.util.Scanner;

public class RemJunkSpecCharfrmString {

    public String text;

    public RemJunkSpecCharfrmString(String text){
        this.text = text ;
    }

    public String removeJunk(){
        return text.replaceAll("[^0-9a-zA-Z]", "");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :");
        String str = sc.nextLine();

        RemJunkSpecCharfrmString rws = new RemJunkSpecCharfrmString(str);

        System.out.println("Original String: " + rws.text);
        System.out.println("String without extra spaces: " + rws.removeJunk());

        sc.close();
    }
}

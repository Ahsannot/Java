
import java.util.Scanner;

public class ReverseString {
    String str ;
    String rev = "";
    public ReverseString(String str) {
        this.str = str ;
    }
    
    public void revString(){
        int len = str.length();
        for(int i = len-1; i >= 0 ; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse string is :" + rev);
    }
    public static void main(String[] args) {
        System.out.print("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ReverseString rs = new ReverseString(str);
        rs.revString();
    }
}

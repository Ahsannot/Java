
import java.util.Scanner;

public class PalindromNumber {
    public int n ;
    public int digit ;
    public int reverse = 0 ;
    public int orignal;
    public PalindromNumber(int n){
        this.n = n;
        this.orignal = n ;
    }
    public void pNumber(){
        while (n != 0) {
            digit = n % 10 ;
            reverse = reverse * 10 + digit ;
            n /= 10; 
        }
        if (reverse == orignal) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }

    }

    public static void main(String[] args) {
        System.out.print("Enter a Palindrom Number:");
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        PalindromNumber pn = new PalindromNumber(number);
        pn.pNumber();
    }
}

package November;

import java.util.Scanner;

public class ReverseNumber {

    public int number ;
    public int digit = 0 ;
    public  int reverse = 0 ;

    public ReverseNumber(int number){
        this.number = number ;
    }

    public int reversedNumber(){
        while (number > 0){
            digit = number % 10 ;
            reverse = reverse * 10 + digit;
            number = number/10;
        }
        return reverse;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();

        ReverseNumber rn = new ReverseNumber(n);
        int count = rn.reversedNumber();
        System.out.println(count);

        sc.close();

    }
}

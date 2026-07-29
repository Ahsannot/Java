package November;

import java.util.Scanner;

public class EvenOddNumber {

    public int n ;

    public EvenOddNumber(int n){
        this.n = n ;
    }

    public void findNumber(){
        if (n%2 == 0){
            System.out.println(n + " is Even");
        }
        else {
            System.out.println(n + " is Odd");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        EvenOddNumber eon = new EvenOddNumber(n);
        eon.findNumber();

        sc.close();
    }
}

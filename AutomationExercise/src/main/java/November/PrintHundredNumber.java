package November;

import java.util.Scanner;

public class PrintHundredNumber {
    public int n ;
    public  PrintHundredNumber(int n){
        this.n = n ;
    }

    public void printNumbers(){
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        PrintHundredNumber pn = new PrintHundredNumber(n);
        pn.printNumbers();

        sc.close();
    }
}

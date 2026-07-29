package November;

import java.util.Scanner;

public class PrimeNumber {
    public  int n ;
    public PrimeNumber(int n){
        this.n = n ;
    }
    public boolean isPrime(){
        if (n <= 1){
            System.out.println("Number is not a prime Number.");
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i==0){
               return false;
            }
        }
        return true;
    }

    public void display(){
        if (isPrime()){
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        PrimeNumber pn = new PrimeNumber(n);
        pn.display();

        sc.close();
    }
}

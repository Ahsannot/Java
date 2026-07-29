package November;

import java.util.Scanner;

public class Factorial {

    public int f = 1 ;
    public int n  ;
    public Factorial(int n){
        this.n = n ;
    }

    public int calFactorial(){
        if (n<0){
            System.out.println("No factorial");
            return -1;
        }
        for (int i = 1; i <=n ; i++) {
            f *=i;
        }
        return f;
    }

    public void display(){
            System.out.println("Factorial of " + n + " is : " + f );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();
        Factorial fac = new Factorial(n);
        fac.calFactorial();
        fac.display();

        sc.close();
    }
}

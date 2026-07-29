package November;

import java.util.Scanner;

public class NumberSum {

    public int a ;
    public int b ;
    public int sum = 0 ;

    public NumberSum(int a, int b){
        this.a = a ;
        this.b = b ;
    }

    public int addNumbers(){
        sum = a + b;
        return sum;
    }

    public void display(){
        System.out.println("Sum is : " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of A :");
        int a = sc.nextInt();

        System.out.println("Enter value of B :");
        int b = sc.nextInt();
        NumberSum ns = new NumberSum(a,b);
        ns.addNumbers();
        ns.display();
        sc.close();
    }
}

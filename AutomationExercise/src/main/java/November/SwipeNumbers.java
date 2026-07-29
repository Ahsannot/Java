package November;

import java.util.Scanner;

public class SwipeNumbers {

    public int a ;
    public int b ;
    public int temp = 0 ;

    public SwipeNumbers(int a , int b){
        this.a = a ;
        this.b = b ;
    }

    public void tempSwipe(){
        temp = a ;
        a = b ;
        b = temp ;
    }

    public void twoNumberSwipe(){
        a = a+b;
        b = a-b;
        a = a-b;
    }

    public void display(){
        System.out.println("Value of A : "  + a  + " and B is : "  + b);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of A : ");
        int a = sc.nextInt();

        System.out.println("Enter value of B : ");
        int b = sc.nextInt();

        SwipeNumbers sn = new SwipeNumbers(a,b);
        System.out.println("Values before Swap");
        sn.display();

//        System.out.println("Values for tempSwipe() Swap");
//        sn.tempSwipe();
//        sn.display();

        System.out.println("Values for twoNumberSwipe() Swap");
        sn.twoNumberSwipe();
        sn.display();

    }
}

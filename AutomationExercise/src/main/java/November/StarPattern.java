package November;

import java.util.Scanner;

public class StarPattern {

    public  int n ;

    public StarPattern(int n){
        this.n = n ;
    }

    public void drawPattern(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public void leftAngleTriangle(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public void rightAngleTriangle(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();

        StarPattern sp = new StarPattern(n);
        sp.drawPattern();

        System.out.println("");

        sp.leftAngleTriangle();

        System.out.println("");

        sp.rightAngleTriangle();

        sc.close();
    }
}

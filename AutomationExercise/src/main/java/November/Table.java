package November;

import java.util.Scanner;

public class Table {
    public int n ;
    public  Table(int n){
        this.n = n ;
    }

    public void printTable(){
        System.out.println("Table of " + n + " is :");
        for (int i = 1; i <=10 ; i++) {
            System.out.println( n + " * " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table number :");
        int n = sc.nextInt();
        Table tb = new Table(n);
        tb.printTable();

        sc.close();
    }
}

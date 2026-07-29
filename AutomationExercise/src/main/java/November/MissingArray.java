package November;

import java.util.Scanner;

public class MissingArray {

    public int [] array ;
    public int expected = 0;
    public int actual = 0;
    public Scanner sc ;
    public int n ;

    public MissingArray(){
        sc = new Scanner(System.in);
    }

    public void readArray(){
        System.out.println("Enter length of an array :");
        n = sc.nextInt();

        int digitToEnter = n-1 ;
        array = new int[n];

        System.out.println("Enter " + digitToEnter + " values in the array, start from 1 to " + n + " ");
        for (int i = 0; i < digitToEnter; i++) {
            array[i] = sc.nextInt();
        }

        expected = n * (n+1) / 2 ;
        for (int num : array){
            actual += num ;
        }
    }

    public void displayArray() {
        System.out.println("Actual sum is : " + actual);
        int missing = expected - actual;
        System.out.println("Missing number is: " + missing);
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {

        MissingArray ma = new MissingArray();
        ma.readArray();
        ma.displayArray();
        ma.closeScanner();
    }
}

package November;

import java.util.Scanner;

public class MaxMinInArray {

    public int [] array ;
    public int min ;
    public int max ;
    public Scanner sc ;
    public int n ;

    public MaxMinInArray() {
        sc = new Scanner(System.in);
    }

    public void readArray(){
        System.out.println("Enter length of an array :");
        n = sc.nextInt();

        array = new int[n];

        System.out.println("Enter " + n + " values in the array :");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        min = array[0];
        max = array[0];

        for (int i = 0; i < n; i++) {
            if (array[i] > max){
                max = array[i];
            }

            if (array[i] < min){
                min = array[i];
            }
        }
    }

    public void displayArray() {
        System.out.println(" Min value is :" + min);
        System.out.println(" Max value is :" + max);
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {

        MaxMinInArray mm = new MaxMinInArray();
        mm.readArray();
        mm.displayArray();
        mm.closeScanner();
    }
}

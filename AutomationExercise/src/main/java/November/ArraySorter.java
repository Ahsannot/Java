package November;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {

    public int [] array ;
    public Scanner sc ;

    public ArraySorter(){
        sc = new Scanner(System.in);
    }

    public void readInput(){
        System.out.println("Enter length of an array :");
        int n = sc.nextInt();

        array = new int[n];

        System.out.println("Enter values of an array :");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Entered values in an array :");

        for (int num : array) {
            System.out.println(num);
        }
    }

    public void SortArray(){
        Arrays.sort(array);
    }

    public void displayArray() {
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // for clean output
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        ArraySorter as = new ArraySorter();
        as.readInput();
        as.SortArray();
        as.displayArray();
        as.closeScanner();
    }
}

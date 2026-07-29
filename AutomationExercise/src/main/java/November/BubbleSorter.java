package November;

import java.util.Scanner;

public class BubbleSorter {

    public int [] array ;
    public Scanner sc ;
    public int n ;
    
    public BubbleSorter(){
        sc = new Scanner(System.in);
    }

    public void readOriginalArray(){
        System.out.println("Enter length of array :");
        n = sc.nextInt();

        array = new int[n];

        System.out.println("Enter " + n + " values in the array :");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
//
//        System.out.println("Original Values :");
//        for (int original : array){
//            System.out.println(original);
//        }
    }

    public void sortArray(){
        for (int i = 0; i < n-1 ; i++) {
            boolean swaped = false;
            for (int j = 0; j < n-1-i; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }

    // Method to display the array
    public void displayArray(String message) {
        System.out.println(message);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        BubbleSorter sorter = new BubbleSorter();

        sorter.readOriginalArray();
        sorter.displayArray("Original array:");
        sorter.sortArray();
        sorter.displayArray("Sorted array:");

        sorter.closeScanner();
    }
}

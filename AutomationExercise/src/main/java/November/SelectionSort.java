package November;

import java.util.Scanner;

public class SelectionSort {

    public int [] array ;
    public Scanner sc ;
    public int n ;
    public int minIndex ;

    public SelectionSort(){
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

        System.out.println("Original Values :");
        for (int original : array){
            System.out.println(original);
        }
    }

    public void sortArray(){
//        [64, 25, 12, 22, 11]
        for (int i = 0; i < n-1 ; i++) {
            minIndex = i;

            for (int j = i+1; j < n; j++) {
                if (array[minIndex] > array[j]){
                    minIndex = j ;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public void display() {
        System.out.println("Sorted array is :");
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {

        SelectionSort ss = new SelectionSort();
        ss.readOriginalArray();
        ss.sortArray();
        ss.display();
        ss.closeScanner();
    }
}

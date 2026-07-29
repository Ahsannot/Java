package November;

import java.util.Scanner;

public class BinarySearch {

    public int [] array ;
    public Scanner sc ;
    public int n ;
    public int target;

    public BinarySearch(){
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


    public void searchNumber(){
        System.out.println("Enter target number :");
        target = sc.nextInt();

        int start = 0 ;
        int end = n-1 ;
        boolean found = false;

        while (start<=end){
            int mid = start + (end-start)/2;
            if (array[mid] == target){
                System.out.println(target + " is found at index: " + mid);
                found = true;
                break;
            } else if (array[mid]< target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        if (!found) {
            System.out.println(target + " is not found in the array.");
        }
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.readOriginalArray();
        bs.sortArray();
        bs.displayArray("Sorted array:");
        bs.searchNumber();
        bs.closeScanner();
    }
}

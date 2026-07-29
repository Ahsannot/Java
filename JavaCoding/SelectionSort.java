import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: "); //5
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: "); //3,5,1,4,2
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array before sorting: ");//3,5,1,4,2
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0 ; i < n-1 ; i++){ //i = 1
            int minIndex = i; // minIndex = 1
            for(int j = i+1 ; j < n ; j++){ // j =  2
                if(arr[minIndex] >arr[j]){ // Finding the minimum element in the array
                    minIndex = j; // Storing the index of the minimum element
                }
            }
            int temp = arr[minIndex]; // Swapping the elements   temp
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.println("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
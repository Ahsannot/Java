import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Binary search is working only on sorted array. 
        // So, first we need to sort the array.
        System.out.println("Binary search is working only on sorted array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println(target + " is found at index: " + mid);
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start > end) {
            System.out.println(target + " is  not found in the array.");
        }
        sc.close();
    }
}
import java.util.Scanner;

public class SumArr {
    public int sum = 0;
    public int arr[];
    // constructor
    public SumArr(int arr[]){
        this.arr = arr;
    }
    // method to calculate the sum of the array
    public void sumArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of the array is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arrsize[] = new int[size];
        // create an object of the SumArr class and call the sumArray method
        SumArr sa = new SumArr(arrsize);
        // call the sumArray method to calculate the sum of the array
        sa.sumArray();
    }
}
import java.util.Scanner;

public class MaxMin{
    public int min = 0 ;
    public int max = 0 ;
    public int arr[];
    public MaxMin(int arr[]){
        this.arr = arr;
    }
    public void  findMaxMin(Scanner sc){
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
    }
    public void printMaxMin(){
        System.out.println("The minimum number in the array is: " + min);
        System.out.println("The maximum number in the array is: " + max);
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arraysize[] = new int[size];
        MaxMin mm = new MaxMin(arraysize);
        mm.findMaxMin(sc);
        mm.printMaxMin();
        sc.close();
    }
}
import java.util.Scanner;

public class PrintEvenOddArray{
    public int even = 0;
    public int odd = 0;
    public int arr[];
    public PrintEvenOddArray(int arr[]){
        this.arr = arr;
    }
    public void printEvenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("The number of even numbers in the array is: " + even);
        System.out.println("The number of odd numbers in the array is: " + odd);
    }
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arraysize[] = new int[size];
        PrintEvenOddArray peoa = new PrintEvenOddArray(arraysize);
        peoa.printEvenOdd();
    }
}

import java.util.Scanner;

public class ArraysEquality {

    public int arr1[];
    public int arr2[];

    public ArraysEquality(int arr1[], int arr2[]){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }
    public void checkEquality(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the first array: ");
        
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elements of the second array: ");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        if(arr1.length != arr2.length){
            System.out.println("The arrays are not equal.");
            return;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                System.out.println("The arrays are not equal.");
                return;
            }
        }
        System.out.println("The arrays are equal.");
    }
    public static void main(String[] args){
        System.out.print("Enter the size of the arrays: ");
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        ArraysEquality ae = new ArraysEquality(arr1, arr2);
        ae.checkEquality();
        sc.close();
    }
}

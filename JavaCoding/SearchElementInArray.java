import java.util.Scanner;

public class SearchElementInArray{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false; // flag is used to check if the element is found or not
        System.out.println("Enter the number to find: ");
        int number = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                System.out.println(number + " is found at position " + i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println(number + " is not found in the array.");
        }
        sc.close();
    }
}
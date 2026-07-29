package November;

import java.util.Scanner;

public class ArrayEquality {

    public int [] arr1;
    public int [] arr2;
    public int n1 ;
    public int n2 ;
    public Scanner sc ;
    public boolean status = true ;

    public ArrayEquality(){
        sc = new Scanner(System.in);
    }

    public void inputArray(){
        System.out.println("Enter length of array 1 :");
        n1 = sc.nextInt();

        arr1 = new int[n1];

        System.out.println("Enter length of array 2 :");
        n2 = sc.nextInt();

        arr2 = new int[n2];

        System.out.println("Enter values in Array 1 :");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("You entered in Array 1 :");
        for(int num : arr1){
            System.out.println(num);
        }

        System.out.println("Enter values in Array 2 :");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("You entered in Array 2 :");
        for(int num : arr2){
            System.out.println(num);
        }
    }

    public void checkEquality(){


        if (arr1.length != arr2.length){
            System.out.println("Arrays are not equal :");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                status = false;
                break;
            }
        }

        if (status) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
    public void closeScanner() {
        sc.close();
    }
    public static void main(String[] args) {
        ArrayEquality ae = new ArrayEquality();
        ae.inputArray();
        ae.checkEquality();
        ae.closeScanner();
    }
}

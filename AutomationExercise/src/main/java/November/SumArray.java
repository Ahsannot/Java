package November;

import java.util.Scanner;

public class SumArray {

    public int [] array ;
    public int sum = 0;
    public Scanner sc ;
    public int n ;

    public SumArray(){
        sc = new Scanner(System.in);
    }

    public void readArray(){
        System.out.println("Enter length of an array :");
        n = sc.nextInt();

        array = new int[n];

        System.out.println("Enter " + n + " values in the array :");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

//        System.out.println("You have entered :");
        for (int num : array){
//            System.out.println(num);
            sum += num ;
        }
    }

    public void displayArray() {
        System.out.println(" Sum is :" + sum);
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {

        SumArray sa = new SumArray();
        sa.readArray();
        sa.displayArray();
        sa.closeScanner();
    }
}

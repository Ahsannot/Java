package November;

import java.util.Scanner;

public class EvenOddArray {

    public int [] array ;
    public int even = 0;
    public int odd = 0 ;
    public Scanner sc ;
    public int n ;

    public EvenOddArray(){
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
            if (num % 2 == 0){
                even++;
            }
            else {
                odd++ ;
            }
        }
    }

    public void displayArray() {
        System.out.println(" Even Count is :" + even);
        System.out.println(" Odd Count is :" + odd);
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {

        EvenOddArray eoa = new EvenOddArray();
        eoa.readArray();
        eoa.displayArray();
        eoa.closeScanner();
    }
}

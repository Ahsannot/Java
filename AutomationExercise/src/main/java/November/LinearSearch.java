package November;

import java.util.Scanner;

public class LinearSearch {

    public int n;
    public int number;
    public int [] array ;
    public Scanner sc ;

    public LinearSearch(){
        sc = new Scanner(System.in);
    }

    public void readInput(){
        System.out.println("Enter length of array :");
        n = sc.nextInt();

        array = new int[n] ;

        System.out.println("Enter " + n + " values in array :");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }

    public void search(){
        System.out.println("Enter number to search in array :");
        number = sc.nextInt();

        boolean status = false;
        for (int i = 0; i < n; i++) {
            if(array[i] == number){
                System.out.println(number + " is found at position " + i);
                status = true;
//                break;
            }
        }
        if (!status){
            System.out.println(number + " is not found in the array.");
        }
    }
    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        ls.readInput();
        ls.search();
        ls.closeScanner();
    }
}

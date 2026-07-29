package November;

import java.util.Scanner;

public class DuplicateElements {

    public int [] array ;
    public Scanner sc ;
    public int n ;

    public DuplicateElements(){
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

        boolean [] isDuplicate = new boolean[n];

        boolean found  = false;
        System.out.println(" duplicates found(s).");

        for (int i = 0; i < n; i++) {
            if (isDuplicate[i]) {
                continue;
            }
            for (int j = i+1; j < n; j++ ){
                if (array[i] == array[j]){
                    if (!found){
                        found = true ;
                    }
                    System.out.println(array[i]);
                    isDuplicate[j] = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found.");
        }
    }


    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {

        DuplicateElements de = new DuplicateElements();
        de.readArray();
        de.closeScanner();
    }
}

package November;

import java.util.Scanner;

public class NameArray {

    public String[] array;
    public Scanner sc;
    public int n;

    public NameArray() {
        sc = new Scanner(System.in);
    }

    public void readArray() {
        System.out.println("Enter length of the array:");
        n = sc.nextInt();
        sc.nextLine(); // consume leftover newline after nextInt()

        array = new String[n];

        System.out.println("Enter " + n + " values in the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine(); // now reads user input correctly
        }
    }

    public void displayArray() {
        System.out.println("Array elements are:");
        for (String value : array) {
            System.out.println(value);
        }
    }

    public void closeScanner() {
        sc.close();
    }

    public static void main(String[] args) {
        NameArray na = new NameArray();
        na.readArray();
        na.displayArray();
        na.closeScanner();
    }
}

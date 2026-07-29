import java.util.Scanner;

class MissingNumbersArray {

    public int arr[];
    public int n;

    public MissingNumbersArray(){

    }

    // Method to take input from the user
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the maximum expected number: ");
        n = sc.nextInt();

        sc.close();
    }

    // Method to find and display missing numbers
    public void findMissingNumbers() {
        
        // Create a boolean array to track the presence of numbers from 1 to n
        // java boolean arrays are initialized to false by default
        boolean[] present = new boolean[n + 1];

        // Mark the numbers that are present
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                present[num] = true;
            }
        }

        System.out.print("Missing numbers: ");
        boolean found = false;

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("No missing numbers.");
        }

        System.out.println();
    }
    
    public static void main(String[] args) {

        MissingNumbersArray obj = new MissingNumbersArray();

        obj.input();
        obj.findMissingNumbers();
    }
}



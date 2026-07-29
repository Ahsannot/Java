import java.util.Scanner;

class DuplicateFinder {
    public int arr[];

    // Constructor
    public DuplicateFinder(int size) {
        arr = new int[size];
    }

    // Method to read array elements
    public void readArray(Scanner sc) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Method to find duplicate elements
    public void findDuplicates() {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] +
                            " is a duplicate element found at positions "
                            + i + " and " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate element found.");
        }
    }
}

public class FindDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create object
        DuplicateFinder finder = new DuplicateFinder(n);

        // Call methods
        finder.readArray(sc);
        finder.findDuplicates();

        sc.close();
    }
}
import java.util.HashSet;
import java.util.Scanner;

class DuplicateFinders {

    private int[] arr;

    // Constructor
    public DuplicateFinders(int size) {
        arr = new int[size];
    }

    // Read array
    public void readArray(Scanner sc) {
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Find duplicates
    public void findDuplicates() {

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {

            if (!seen.add(num)) {
                duplicates.add(num);
            }

        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}

public class FindDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        DuplicateFinders finder = new DuplicateFinders(n);

        finder.readArray(sc);

        finder.findDuplicates();

        sc.close();
    }
}
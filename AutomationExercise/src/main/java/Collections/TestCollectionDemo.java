package Collections;

import java.util.*;

public class TestCollectionDemo {

    public int n ;
    public Scanner sc ;

    public TestCollectionDemo(){
        sc = new Scanner(System.in);
    }

    public void listDemo(){
        ArrayList<String> testNames = new ArrayList<>();

        System.out.print("How many test case names you want to enter? ");
        n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter test name: ");
            testNames.add(sc.nextLine());
        }

        // Sort alphabetically
        Collections.sort(testNames);

        System.out.println("\nSorted Test Case Names:");
        for (String name : testNames) {
            System.out.println(name);
        }

    }

    public void SetDemo(){
        HashSet<Integer> uniqueTestIDs = new HashSet<>();

        System.out.print("\nHow many test IDs you want to enter? ");
        int idCount = sc.nextInt();

        for (int i = 0; i < idCount; i++) {
            System.out.print("Enter test ID: ");
            int id = sc.nextInt();
            uniqueTestIDs.add(id); // duplicates automatically removed
        }

        System.out.println("\nUnique Test IDs (Set):");
        for (int id : uniqueTestIDs) {
            System.out.println(id);
        }
    }

    public void mapDemo(){
        HashMap<String, String> loginData = new HashMap<>();
        sc.nextLine(); // clean buffer

        System.out.print("\nHow many login credentials (username/password) to enter? ");
        int userCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < userCount; i++) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            loginData.put(username, password);
        }

        System.out.println("\nLogin Credentials (HashMap):");
        for (HashMap.Entry<String, String> entry : loginData.entrySet()) {
            System.out.println("Username: " + entry.getKey() +
                    " — Password: " + entry.getValue());
        }
    }

    public void closeScanner(){
        sc.close();
    }

    public static void main(String[] args) {

        TestCollectionDemo tcd = new TestCollectionDemo();
        tcd.listDemo();
        tcd.SetDemo();
        tcd.mapDemo();

        tcd.closeScanner();
    }

}



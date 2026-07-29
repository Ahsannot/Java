package Collections;

import java.util.*;

public class CollectionDemo {

    public int n ;
    public int key;
    public String value ;
    public Scanner sc ;

    public CollectionDemo(){
        sc = new Scanner(System.in);
    }

    public void arrayListDemo(){

        @SuppressWarnings("unused")
        ArrayList listGeneric = new ArrayList();
        ArrayList<String> listString = new ArrayList<String>();
        ArrayList<String> listRecommended = new ArrayList<>();

        System.out.println("Enter how many lists you wants to add :");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for ArrayList: ");
            value = sc.nextLine();
            listRecommended.add(value);
        }

        System.out.println("ArrayList Elements:");
//        Iterator<String> it = listRecommended.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        for (String list : listRecommended){
            System.out.println(list);
        }
    }

    public void hashSetDemo(){

        HashSet setGeneric = new HashSet();
        HashSet<String> setString = new HashSet<String>();
        HashSet<String> setRecommended = new HashSet<>();

        System.out.println("Enter how many Sets you wants to add :");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for HashSet: ");
            value = sc.nextLine();
            setRecommended.add(value);
        }

        System.out.println("HashSet Elements:");
//        Iterator<String> it = listRecommended.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        for (String list : setRecommended){
            System.out.println(list);
        }

    }

    public void hashMapDemo(){

        HashMap mapGeneric = new HashMap();
        HashMap<Integer, String> mapIntegerString = new HashMap<Integer, String>();
        HashMap<Integer, String> mapRecommended = new HashMap<>();

        System.out.println("Enter how many HashMap you wants to add :");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Key (Integer): ");
            key = sc.nextInt();
            sc.nextLine();  // consume leftover newline

            System.out.print("Enter Value (String): ");
            value = sc.nextLine();

            mapRecommended.put(key,value);
        }

        System.out.println("HashMap Elements:");
        for (Map.Entry<Integer, String> e : mapRecommended.entrySet()){
            System.out.println("Key: " + e.getKey() + " → Value: " + e.getValue());
        }
    }

    public void closeScanner(){
        sc.close();
    }

    public static void main(String[] args) {

        CollectionDemo cd = new CollectionDemo();
        cd.arrayListDemo();
        cd.hashSetDemo();
        cd.hashMapDemo();

        cd.closeScanner();
    }
}

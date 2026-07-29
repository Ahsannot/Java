import java.util.Scanner;

public class HallowPattern3 {
    public int n;
public HallowPattern3(int n) {
    this.n = n;
}
public void printMultiplication(){
    System.out.println("Hollow Multiplication:");
    for (int i = 1 ; i <= n ; i ++){
        for(int j = 1 ; j<= n ; j++){
            if(i == j || i + j == n + 1){
                System.out.print("*  ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println(); // Move to the next line after each row
    }
}
public static void main(String[] args) {
    System.out.println("Enter the size of the multiplication pattern:");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    HallowPattern3 pattern = new HallowPattern3(size);
    pattern.printMultiplication();
}
}

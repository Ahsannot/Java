
import java.util.Scanner;

public class LeftTri {
    public int n;
    public LeftTri(int n){
        this.n = n;
    }
    public void printLeftTriangle(){
        // Loop through each row
        for(int i = 1; i < n; i++){
            // Print spaces for left alignment
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            // Print stars for the left triangle
            for(int j = 1; j < i; j++){
                System.out.print("* ");
            }
            // Print the last star in the row
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            // Print spaces for left alignment
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            // Print stars for the left triangle
            for(int j = i; j < n; j++){
                System.out.print("* ");
            }
            // Print the last star in the row
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows for the left triangle:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LeftTri tri = new LeftTri(n);
        tri.printLeftTriangle();
    }
}

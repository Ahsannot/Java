
import java.util.Scanner;

public class RightTri {
    public int n;
    public RightTri(int n){
        this.n = n;
    }
    public void printRightTriangle(){
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows for the right triangle:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RightTri tri = new RightTri(n);
        tri.printRightTriangle();
    }
}

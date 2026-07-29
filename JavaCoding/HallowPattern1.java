import java.util.Scanner;

public class HallowPattern1 {
    public int n;

    public HallowPattern1(int n){
        this.n = n;
    }
    public void printSquare(){
        // Implementation for printing hollow square
        System.out.println("Hollow Square:");
        for (int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j<= n ; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");

                }

            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the square:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        HallowPattern1 pattern = new HallowPattern1(size);
        pattern.printSquare();
    }
}

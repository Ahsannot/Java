import java.util.Scanner;

public class TeenTahni {
    public int n;

    public TeenTahni(int n){
        this.n = n;
    }
    public void printSquare(){
        // Implementation for printing hollow square
        System.out.println("Hollow Square:");
        for (int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j<= n ; j++){
                if(i == 1 || i == n || j == 1 || j == n || i == (n/2 + 1) || j == (n/2 + 1) || i == j || i + j == n + 1){
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
        TeenTahni pattern = new TeenTahni(size);
        pattern.printSquare();
    }
}


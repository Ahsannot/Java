import java.util.Scanner;

public class HallowPattern2 {
    public int n;
    public HallowPattern2(int n){
        this.n = n;
    }
    public void printPlus(){
        System.out.println("Hollow Plus:");
        for (int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j<= n ; j++){
                if(i == (n/2 + 1) || j == (n/2 + 1)){
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the plus pattern:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        HallowPattern2 pattern = new HallowPattern2(size);
        pattern.printPlus();
    }
}

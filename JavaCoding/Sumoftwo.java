public class Sumoftwo {

    public Sumoftwo() {
    }

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two numbers is :" + sum);
    }

    public void displaySum(int a, int b) {
        sum(a, b);
    }
    public static void main(String[] args) {
        Sumoftwo sumCalculator = new Sumoftwo();
        sumCalculator.displaySum(10, 15);
    }
}

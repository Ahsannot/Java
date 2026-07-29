public class FactorialNumber {
    public FactorialNumber(){

    }
    public int calculateFactorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial * i;
            System.out.println("Current value of factorial: " + factorial);
        }
        return factorial;
    }
    public static void main(String[] args) {
        FactorialNumber factorial = new FactorialNumber();
        int result = factorial.calculateFactorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}

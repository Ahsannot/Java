public class PrimeNumber {
    public PrimeNumber(){

    }
    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();
        int number = 29;
        if(prime.isPrime(number)){
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

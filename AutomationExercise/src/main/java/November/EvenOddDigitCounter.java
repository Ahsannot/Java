package November;

import java.util.Scanner;

public class EvenOddDigitCounter {

    public int evenCount = 0 ;
    public int oddCount = 0 ;
    public int number ;

    public EvenOddDigitCounter(int number){
        this.number = number;
    }

    public void DigitCounter(){
        int temp = number ;
        while (temp > 0){
           int digit = temp % 10 ;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            temp = temp / 10; // Remove last digit
        }

        // Display the result
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an instance of PalindromeNumber with input
        EvenOddDigitCounter eodc = new EvenOddDigitCounter(number);

        eodc.DigitCounter();

        scanner.close();
    }
}

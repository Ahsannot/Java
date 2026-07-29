package November;

import java.util.Scanner;

public class DigitSumCalculator {

    public int evenCount = 0 ;
    public int oddCount = 0 ;
    public int number ;
    public int sum = 0 ;

    public DigitSumCalculator(int number){
        this.number = number;
    }

    public void SumCounter(){
        int temp = number ;
        while (temp > 0){
            int digit = temp % 10 ;
            sum += digit;
            temp = temp / 10; // Remove last digit
        }

        // Display the result
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an instance of PalindromeNumber with input
        DigitSumCalculator dsc = new DigitSumCalculator(number);

        dsc.SumCounter();

        scanner.close();
    }
}

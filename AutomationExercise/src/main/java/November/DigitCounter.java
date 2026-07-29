
package November;

import java.util.Scanner;

public class DigitCounter {


    public int number ;
    public int counter = 0 ;

    public DigitCounter(int number){
        this.number = number;
    }

    public void SumCounter(){
        while (number > 0){
            number = number / 10; // Remove last digit
            counter++;
        }

        // Display the result
        System.out.println("counter is : " + counter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Create an instance of PalindromeNumber with input
        DigitCounter dsc = new DigitCounter(number);

        dsc.SumCounter();

        scanner.close();
    }
}

public class ReverseNumber {
    
    public ReverseNumber() {
    }

    public void reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        System.out.println("Reversed number is: " + reversed);
    }

    public void stringReverse(int number) {
        String strNumber = Integer.toString(number); // Convert the number to a string
        String reversedStr = new StringBuilder(strNumber).reverse().toString(); // Reverse the string representation of the number 
        System.out.println("Reversed number is: " + reversedStr); // Print the reversed string representation of the number
    }

    public void displayStringReverse(int number) {
        stringReverse(number);
    }

    public void displayReverse(int number) {
        reverse(number);
    }

    public static void main(String[] args) {
        ReverseNumber reverseCalculator = new ReverseNumber();
        reverseCalculator.displayReverse(12345);
        reverseCalculator.displayStringReverse(12345);
    }
}

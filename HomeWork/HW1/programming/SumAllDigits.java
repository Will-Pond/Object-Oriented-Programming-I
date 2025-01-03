import java.util.Scanner;
public class SumAllDigits {
    // Main method
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        // Read a number
        System.out.print("Enter an integer between 0 and 999: ");
        int number = input.nextInt();

        // Find all digits in number
        int lastDigit = number % 10;
        int remainingNumber1 = number - lastDigit;
        int secondLastDigit = (remainingNumber1 / 10) % 10;
        int remainingNumber2 = number - (lastDigit + secondLastDigit);
        int thirdLastDigit = (remainingNumber2 / 10) / 10;

        // Obtain the sum of all digits
        int sum = lastDigit + secondLastDigit + thirdLastDigit;

        // Display results
        System.out.println("The sum of all digits in " + number
                + " is " + sum);
    }
}

/**
 Enter an integer between 0 and 999: 457
 The sum of all digits in 457 is 16

 Process finished with exit code 0
 */
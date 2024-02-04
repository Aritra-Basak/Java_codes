//The below code generates limited random numbers within the user defined range.
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerLimit = 0;
        int upperLimit = 0;
        int numberOfRandomNumbers = 20;

        try {
            System.out.print("Enter the lower limit: ");
            lowerLimit = scanner.nextInt();

            System.out.print("Enter the upper limit: ");
            upperLimit = scanner.nextInt();

            if (lowerLimit >= upperLimit) {
                throw new IllegalArgumentException("Upper limit must be greater than lower limit.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integer values and ensure upper limit is greater than lower limit.");
            return;
        }

        System.out.println("Generating " + numberOfRandomNumbers + " random numbers between " + lowerLimit + " and " + upperLimit + ":");

        for (int i = 0; i < numberOfRandomNumbers; i++) {
            int randomNum = lowerLimit + (int)(Math.random() * ((upperLimit - lowerLimit) + 1));
            System.out.print(randomNum + " ");
        }

        scanner.close();
    }
}

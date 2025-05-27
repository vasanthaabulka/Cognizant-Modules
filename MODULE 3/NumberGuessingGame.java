import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Guess the number (1-100): ");
            guess = scanner.nextInt();
            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed it!");
            }
        } while (guess != number);
        scanner.close();
    }
}

import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Generate a random number between 1 and 100
        int random = 50;

        System.out.println("Guess the number between 1 and 100 : ");
        int guess = sc.nextInt(); // Initial user guess

        // Use a while loop to keep checking until the guess is correct
        while (guess != random) {
            if (guess < random) {
                System.out.println("Too low. Try again: ");
            } else {
                System.out.println("Too high. Try again: ");
            }
            guess = sc.nextInt(); // Take the next guess
        }

        // When the guess is correct
        System.out.println("Congratulations! You guessed the correct number.");
        sc.close(); // Close the scanner to avoid memory leaks
    }
}

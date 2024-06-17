
import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame2 {
    public static void main(String[] args) {
        int score = 0;
        int rounds = 3;

        for (int i = 0; i < rounds; i++) {
            int attempts = 0;
            int maxAttempts = 10;

            // Generate a random number between 1 and 100
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;

            boolean guessed = false;

            while (!guessed && attempts < maxAttempts) {
                // Prompt the user to enter a number
                String userInput = JOptionPane.showInputDialog("Round " + (i + 1) + ": Please enter a number between 1 and 100:");

                try {
                    int number = Integer.parseInt(userInput);

                    attempts++;

                    // Check if the user's number matches the generated number
                    if (number == randomNumber) {
                        guessed = true;
                        score += maxAttempts - attempts + 1;
                        JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts. You earned " + (maxAttempts - attempts + 1) + " points.");
                    } else if (number < randomNumber) {
                        JOptionPane.showMessageDialog(null, "Sorry, your number is too low. Try again!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Sorry, your number is too high. Try again!");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "You did not enter a valid number. Please try again.");
                }
            }

            if (!guessed) {
                JOptionPane.showMessageDialog(null, "Sorry, you didn't guess the number in " + maxAttempts + " attempts. The correct answer was " + randomNumber + ".");
            }
        }

        JOptionPane.showMessageDialog(null, "Game over! Your final score is " + score + " points.");
    }
}
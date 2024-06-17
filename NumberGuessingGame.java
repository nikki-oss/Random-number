
     import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // Prompt the user to enter a number
        String userInput = JOptionPane.showInputDialog("Please enter a number between 1 and 10:");

        try {
            int number = Integer.parseInt(userInput);

            // Check if the user's number matches the generated number
            if (number == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number!");
            } else if (number < randomNumber) {
                JOptionPane.showMessageDialog(null, "Sorry, your number is too low. Try again!");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, your number is too high. Try again!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You did not enter a valid number. Please try again.");
        }
    }
}


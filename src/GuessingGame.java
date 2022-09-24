import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    //Within public class GuessingGame create a public Guessing game constructor
    public GuessingGame() {
        // Create a new Scanner variable named input, this will be what you use to store the user input
        Scanner input = new Scanner(System.in);

        // Create a boolean object called correctGuess and set it equal to false
        boolean correctGuess = false;

        // Create 2 int variables. First is called guess, second is increment. Set both equal to 0
        int guess = 0;
        int increment = 0;

        // Print “Hello user. What is your name?”
        // Create a new String variable named name which is set equal to input.nextLine()
        System.out.println("Hello user. What is your name?");
        String name = input.nextLine();

        // Print “Welcome name I’m thinking of a number between 1 and 100.”
        // Create a new random object
        // rand.nextInt(100) chooses the next number generated by rand from the limit of 1 to 100
        System.out.println("Welcome, " + name + ". I’m thinking of a number between 1 and 100.");
        Random randomNum = new Random();
        int number = randomNum.nextInt(100);

        System.out.println("Try to guess my number");

        // while correctGuess is false
            // inc increment by 1
            // Create a try -catch block
                // try - Set guess equal to input.nextInt()
                // catch - Exception e
                    // Create a new String called badInput and set it to input.next()
                    // Use continue to skip back to the beginning of the while loop

        while (correctGuess == false) {

            increment++;

            try {
                guess = input.nextInt();

            } catch (Exception e) {

                String badInput = input.next();
                System.out.println("That's not an integer, try again.");

                continue;
            }

            // Check:
            // if the guess is greater than 100 or less than 1
                // Print “You’re guess is out of range. Please try again.”
            // else-if the guess is greater than the number
                // Print “You’re guess is too high. Please try again.”
            // else-if the guess is less than the number
                // Print “You’re guess is too low. Please try again.”
            // else-if the guess is equal to number
                // Print “Well done, name! You found my number in increment tries!”
                // Set correctGuess equal to true

            if ( guess > 100 || guess < 1 ) {
                System.out.println("Your guess is out of range. Please try again.");
            } else if ( guess > number ) {
                System.out.println("Your guess is too high. Please try again.");
            } else if ( guess < number ) {
                System.out.println("Your guess is too low. Please try again.");
            } else if ( guess == number ) {
                System.out.println("Well done, " + name + "! You found my number in " + increment + " tries!" + "\n");

                correctGuess = true;
            }

        }
    }
}

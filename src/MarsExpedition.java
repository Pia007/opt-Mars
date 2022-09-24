import java.util.Scanner;

public class MarsExpedition {

    // create a public MarsExpedition constructor
    public MarsExpedition() {

        // Create a new Scanner variable named input, to store user input

        Scanner input = new Scanner(System.in);

        System.out.println("Expedition prep program starting…");
        System.out.println("Booting up…");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");


        System.out.println("\nHello user. What's your name?");

        String name = input.nextLine();

        System.out.println("\nHi, " + name + " --Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");

        String excited = input.nextLine();

        // Check:
        // if excited is equal to Y ignoring case
            // Print “I knew you would say that. You are team leader for a reason.”
        // Use an else statement for everything else
            // Print “To bad you are team leader. You have to go.”

        if (excited.equalsIgnoreCase("Y")) {
            System.out.println("\nI knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("\nTo bad you are team leader. You have to go.");
        }


        System.out.println("\nHow many people do you want on your expedition team? (Input an int number)");

        int teamSize = input.nextInt();

        input.nextLine();

        // Check:
        // if teamSize is greater than 2
            // Print “That’s way to many people. We can only send 2 more members.”
            // Set teamSize equal to 2
        // else-if teamSize is less than 2
            // Print “That’s not enough people. We need you and 2 more members.”
            // Set teamSize equal to 2
        // else if teamSize equals 2
            // Print “That’s a perfect sized team. Good job.”

        if (teamSize > 2) {
            System.out.println("\nThat’s way to many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("\nThat’s not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("\nThat’s a perfect sized team. Good job.");
        }


        System.out.println("\nYou are allowed to bring one weapon with you. You know, just in case. What do you want to bring?");

        String weapon = input.nextLine();

        System.out.println("\nNice choice, you will be bringing a " +  weapon + " with you.");

        System.out.println("\nYou have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");

        // Create a String variable named vehicleChoice and set it equal to input.nextLine()
        String vehicleChoice = input.nextLine();

        // Check:
        //if vehicleChoice is equal to A ignoring case
            // set vehicleChoice equal to “Mars Roover”
        // else if vehicleChoice is equal to B ignoring case
            // set vehicleChoice equal to “Chevy Silverado”
        // else if vehicleChoice is equal to C ignoring case
            // set vehicleChoice equal to “Honda Civic”
        // otherwise vehicleChoice does not equal any of the above
            // set vehicleChoice equal to “your feet”


        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "Honda Civic";
        } else {
            vehicleChoice = "your feet";
        }


        System.out.println("\nYour expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using a " +  vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }
}

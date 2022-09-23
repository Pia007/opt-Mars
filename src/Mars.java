public class Mars {
    public static void main(String[] args) throws InterruptedException{
        String ColonyName = "Titan";
        int ShipPopulation = 300;
        double ShipFood = 4000.00;
        boolean Landing = true;

        // The landing process takes 2 days, calculate how much food is left after landing Equation:
        // Food = Food - (Pop * 0.75); Use the equation twice

        ShipFood = (ShipFood - 2 *(ShipPopulation * 0.75));
        // ShipFood = ShipFood - (ShipPopulation * 0.75);

        // Print the amount of food that is left
        System.out.println(ShipFood);

        // extra crate of food increases ShipFood by 50%
        ShipFood = ShipFood + ( ShipFood * 0.50);
        System.out.println(ShipFood);


        // 5 more babies join the ShipPopulation
        ShipPopulation += 5;
        System.out.println(ShipPopulation);

        // Choose where you want the ship to land. The Hill, The Plain, or The Ocean.
        // Create a String value called LandingLocation and set it equal to “The Hill” or “The Plain” or “The Ocean”
        String LandingLocation = "The Ocean";

        // Create an if-else statement. That checks to see if the LandingLocation is equal to “The Plain” ignoring case
        if (LandingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain!!");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain.");
        }

        // Call a function called LandingCheck() that has a parameter of 100, returns boolean, and set it equal to Landing
        Landing = LandingCheck(100);

        // Run the GuessingGame by calling a new GuessingGame constructor
        new GuessingGame();
    }

    // Create a public static void function called LandingCheck with an int parameter called Loops
    // Create a for loop, i = 0, loops until i is equal to Loops and inc by 1
    // Check if i is divisible by 3 and divisible by 5, print "Keep Center"
    // Else if i is divisible by 5, print "Right"
    // Else if i is divisible by 3, print "Left"
    // Otherwise print "Calculating"
    // use Thread.sleep(250) after the if-else but prior to the end of the loop
        // slows the console down by 250ms
    // after the loop, print "Landed"
    // return false
    public static boolean LandingCheck(int Loops) throws InterruptedException {
        for (int i = 0; i <= Loops; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep Center");
            } else if ((i % 5) == 0) {
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");

        return false;
    }
}

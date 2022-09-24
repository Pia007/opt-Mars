import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsLists {

    // constructor
    public FindingsLists() throws InterruptedException {

        // stop the terminal for half a second
            // need to use an exception in the constructor declaration
        Thread.sleep(500);

        System.out.println("\nWelcome back from your expedition. Time to catalog everything you found,");

        // rockList
        ArrayList<String> rockList = new ArrayList<>();

        System.out.println("\nRock data downloaded.");

        // add 4 rocks to the list and print rockList
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("\nWait a second that last one is not a rock we need to delete that one from the list.");

        //remove "not rock"
        rockList.remove(3);

        System.out.println("\n" + rockList);

        System.out.println("\nPerfect");

        // stop the terminal for half a second
        Thread.sleep(500);

        // Create a Hashmap called fossilDirectory
        HashMap<String, String> fossilDirectory = new HashMap<>();

        // Print “Fossil data downloaded”
        System.out.println("\nFossil data downloaded");

        // Add 3 fossils and their description to the Hashmap
            // Bird Fossil, The fossil has wings implying it was capable of flight
            // Fish Fossil, The fossil is vaguely fish shaped implies there was once water
            // Tooth Fossil, The tooth from an unknown fossil
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight.");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water.");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("\nWhich of the fossils would you like to learn more about (Spelling and Spacing is important)?");


        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        // Check
            // if fossilChoice equals “Bird Fossil”,  Print “Fossil: fossilChoice nDescription: fossilDirectory.get(fossilChoice)
            // else if fossilChoice equals “Fish Fossil”,  Print “Fossil: fossilChoice nDescription: fossilDirectory.get(fossilChoice)
            // else if fossilChoice equals “Tooth Fossil”, Print “Fossil: fossilChoice nDescription: fossilDirectory.get(fossilChoice)

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice +
                    "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice +
                    "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice +
                    "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        // stop the terminal for half a second
        Thread.sleep(500);

        // Create a HashSet called suppliesBrought
        // Create a HashSet called suppliesUsed
        HashSet<String> suppliesBrought = new HashSet<>();

        HashSet<String> suppliesUsed = new HashSet<>();

        // Add Food, Water and Medicine to suppliesBrought
        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");

        // Add Food and Water to suppliesUsed
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");

        // what is leftover?
            // remove items that suppliesBrought and suppliesUsed share in common
        suppliesBrought.removeAll(suppliesUsed);

        // print what's suppliesBrought set
        for(String sb: suppliesBrought)
            System.out.println("\nThere is only " + sb + " left.");
    }
}

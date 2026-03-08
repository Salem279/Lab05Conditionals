import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyChoice = "";

        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat\nR - Republican\nI - Independent");
        System.out.print("Enter your choice [D, R, I]: ");

        if (in.hasNextLine()) {
            partyChoice = in.nextLine();

            // Cascaded if-else structure
            if (partyChoice.equalsIgnoreCase("D")) {
                System.out.println("You get a Democratic Donkey.");
            } else if (partyChoice.equalsIgnoreCase("R")) {
                System.out.println("You get a Republican Elephant.");
            } else if (partyChoice.equalsIgnoreCase("I")) {
                System.out.println("You get an Independent Person.");
            } else {
                System.out.println("You get an Other.");
            }
        }
    }
}
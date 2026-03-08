import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.print("Enter your birth month (1-12): ");

        // This checks if the user actually typed a number
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); // clear the buffer

            // This checks if the number is between 1 and 12
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                // If they enter 13, 0, -1, etc.
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            // If they type "January" instead of 1
            System.out.println("Invalid input. Please enter a whole number.");
        }
    }
}
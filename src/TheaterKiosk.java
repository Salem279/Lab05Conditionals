import java.util.Scanner;

public class TheaterKiosk {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (age >= 21) {
            System.out.println("You get a paper wrist band.");
        }

    }
}
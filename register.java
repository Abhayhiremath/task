import java.util.Scanner;

public class Register {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== REGISTRATION PAGE =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.print("Confirm Password: ");
        String confirmPassword = sc.nextLine();

        // Check password
        if (password.equals(confirmPassword)) {

            System.out.println("\nRegistration Successful!");
            System.out.println("Welcome, " + name);
            System.out.println("Username: " + username);
            System.out.println("Email: " + email);

        } else {

            System.out.println("\nPassword does not match!");
            System.out.println("Please try again.");

        }

        sc.close();
    }
}
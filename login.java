import java.io.Console;

public class LoginPage {

    public static void main(String[] args) {

        Console console = System.console();

        String correctUsername = "admin";
        String correctPassword = "1234";

        int attempts = 3;
        boolean loginSuccessful = false;

        System.out.println("================================");
        System.out.println("          LOGIN PAGE");
        System.out.println("================================");

        for (int i = 1; i <= attempts; i++) {

            String username = console.readLine("Enter Username: ");
            char[] passwordArray = console.readPassword("Enter Password: ");
            String password = new String(passwordArray);

            if (username.equals(correctUsername) &&
                password.equals(correctPassword)) {

                System.out.println("\nLogin Successful!");
                System.out.println("Welcome, " + username);

                loginSuccessful = true;
                break;

            } else {

                int remaining = attempts - i;

                if (remaining > 0) {
                    System.out.println("\nInvalid Username or Password!");
                    System.out.println("Attempts remaining: " + remaining);
                    System.out.println();
                }
            }
        }

        if (!loginSuccessful) {
            System.out.println("\n================================");
            System.out.println("Account temporarily locked!");
            System.out.println("Too many failed login attempts.");
            System.out.println("================================");
        }
    }
}
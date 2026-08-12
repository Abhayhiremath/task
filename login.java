```java
import java.util.Scanner;

public class LoginPage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Stored username and password
        String correctUsername = "admin";
        String correctPassword = "1234";

        System.out.println("===== LOGIN PAGE =====");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Check login details
        if (username.equals(correctUsername) &&
            password.equals(correctPassword)) {

            System.out.println("\nLogin Successful!");
            System.out.println("Welcome, " + username);

        } else {
            System.out.println("\nInvalid Username or Password!");
        }

        sc.close();
    }
}
```

package BasixSyntax;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        String password = "";

        for (int pos = userName.length() - 1; pos >= 0; pos--)
            password += userName.charAt(pos);

        String userEntry = scanner.nextLine();
        int count = 0;

        while (!password.equals(userEntry)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            userEntry = scanner.nextLine();

        }
        if (userEntry.equals(password))
            System.out.printf("User %s logged in.", userName);
    }
}

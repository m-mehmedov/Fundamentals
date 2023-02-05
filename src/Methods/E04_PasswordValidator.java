package Methods;

import java.util.Scanner;

public class E04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isValid = true;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        for (int i = 0; i < password.length(); i++)
            if (!checkIfLetterOrDigit(password.charAt(i))) {
                System.out.println("Password must consist only of letters and digits");
                isValid = false;
                break;
            }
        if (countDigits(password) < 2){
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }
        if (isValid)
            System.out.println("Password is valid");
    }
    public static boolean checkIfLetterOrDigit(char curChar){
        return curChar >= '0' && curChar <= '9'
                || curChar >= 'A' && curChar <= 'Z'
                || curChar >= 'a' && curChar <= 'z';
    }
    public static int countDigits(String password){
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
                count++;
        }
        return count;
    }
}

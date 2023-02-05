package Methods;

import java.util.Scanner;

public class E09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("END")){
            if (isPalindrome(inputLine))
                System.out.println("true");
            else
                System.out.println("false");
            inputLine = scanner.nextLine();
        }
    }
    public static boolean isPalindrome(String number){
        boolean isValid = true;
        for (int i = 0; i < number.length()/2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}

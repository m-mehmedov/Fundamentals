package BasicSyntaxMore;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = "";
        int number = 0;
        int numberOfDigits = 0;
        int mainDigit = -1;
        int offset = 0;
        int letterIndex = 0;

        int length = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < length; i++){
            inputLine = scanner.nextLine();
            number = Integer.parseInt(inputLine);
            numberOfDigits = inputLine.length();
            mainDigit = number % 10;
            offset = (mainDigit - 2) * 3;

            if (mainDigit == 0)
                System.out.print(" ");
            else {
                if (mainDigit >= 8)
                    offset++;
                letterIndex = offset + numberOfDigits - 1;
                System.out.printf("%c", 'a' + letterIndex);
            }
        }
    }
}

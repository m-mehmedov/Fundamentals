package DataTypesandVariables;

import java.util.Scanner;

public class E05_printPartOfTheASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCharIdx = Integer.parseInt(scanner.nextLine());
        int secondCharIdx = Integer.parseInt(scanner.nextLine());

        for (int i = firstCharIdx; i <= secondCharIdx; i++) {
            System.out.printf("%c ", (char)i);
        }
    }
}

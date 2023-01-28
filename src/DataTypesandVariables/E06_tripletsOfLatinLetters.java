package DataTypesandVariables;

import java.util.Scanner;

public class E06_tripletsOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        char curChar = 'a';

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                for (int k = 0; k < number; k++) {
                    System.out.printf("%c%c%c%n", curChar + i, curChar + j, curChar + k);
                }
            }
        }
    }
}

package DataTypesandVariablesMore;

import java.util.Scanner;

public class E04_Refactoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int curNumber = 2; curNumber <= number; curNumber++) {
            boolean isPrime = true;
            for (int divider = 2; divider < curNumber; divider++) {
                if (curNumber % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", curNumber, isPrime);
        }
    }
}

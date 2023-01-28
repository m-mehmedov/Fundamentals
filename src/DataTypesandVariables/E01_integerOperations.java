package DataTypesandVariables;

import java.util.Scanner;

public class E01_integerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int fourthNumber = Integer.parseInt(scanner.nextLine());

        int sum = firstNumber + secondNumber;
        int div = sum / thirdNumber;
        int mul = div * fourthNumber;

        System.out.println(mul);
    }
}

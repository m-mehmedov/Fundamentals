package DataTypesandVariablesMore;

import java.util.Scanner;

public class E03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double difference = Math.abs(firstNumber - secondNumber);
        double eps = 0.000001;

        if (difference >= eps)
            System.out.println("False");
        else
            System.out.println("True");
    }
}

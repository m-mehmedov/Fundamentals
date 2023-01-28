package DataTypesandVariables;

import java.util.Scanner;

public class E02_sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        int sum = 0;

        while (number > 0 ){
            digit = number % 10;
            number /= 10;
            sum += digit;
        }
        System.out.println(sum);
    }
}

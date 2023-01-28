package BasixSyntax;

import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int number = firstNum; number <= secondNum; number++) {
            System.out.printf("%d ", number);
            sum += number;
        }
            System.out.println();
            System.out.println("Sum: " + sum);
    }
}

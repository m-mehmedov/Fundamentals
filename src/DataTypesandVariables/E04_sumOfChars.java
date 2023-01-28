package DataTypesandVariables;

import java.util.Scanner;

public class E04_sumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < number; i++) {
            int curNum = (int)scanner.nextLine().charAt(0);

            sum += curNum;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}

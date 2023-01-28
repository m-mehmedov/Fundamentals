package BasixSyntax;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++)
                System.out.printf(i + " ");
            System.out.println();
        }
    }
}

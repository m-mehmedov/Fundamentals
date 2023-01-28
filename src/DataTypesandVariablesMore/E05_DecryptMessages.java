package DataTypesandVariablesMore;

import java.util.Scanner;

public class E05_DecryptMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.print((char)(scanner.nextLine().charAt(0) + key));
        }
        System.out.println();
    }
}

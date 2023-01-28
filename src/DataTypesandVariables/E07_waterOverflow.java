package DataTypesandVariables;

import java.util.Scanner;

public class E07_waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int volume = 255;
        for (int i = 0; i < number; i++) {
            int curLitters = Integer.parseInt(scanner.nextLine());
            if (curLitters > volume)
                System.out.println("Insufficient capacity!");
            else
                volume -= curLitters;
        }
        System.out.println(255 - volume);
    }
}

package Arrays;

import java.util.Scanner;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int[] numberOfPassengers = new int[numberOfWagons];

        int sum = 0;

        for (int i = 0; i < numberOfWagons; i++) {
            numberOfPassengers[i] = Integer.parseInt(scanner.nextLine());
            sum += numberOfPassengers[i];
            System.out.printf("%d ",numberOfPassengers[i]);
        }

        System.out.println();
        System.out.println(sum);
    }
}

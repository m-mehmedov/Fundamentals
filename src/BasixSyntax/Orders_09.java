package BasixSyntax;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int order = 0; order < numberOfOrders; order++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth  = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double price = ((daysInMonth * capsulesCount) * pricePerCapsule);
            totalPrice += price;

            System.out.printf("The price for the coffee is: $%.2f%n", price);
        }
        System.out.printf("Total: $%.2f%n", totalPrice);
    }
}

package ExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;

        boolean discount = false;

        while (true){
            String inputLine = scanner.nextLine();

            if (inputLine.equals("special")){
               discount = true;
                break;
            }
            if (inputLine.equals("regular")){
                break;
            }

            double currentPrice = Double.parseDouble(inputLine);

            if (currentPrice <= 0){
                System.out.println("Invalid price!");
            }
            else {
                totalPrice += currentPrice;
            }
        }
        if (totalPrice == 0)
            System.out.println("Invalid order!");
        else {
            if (discount)
                System.out.printf("Congratulations you've just bought a new computer!%n" +
                        "Price without taxes: %.2f$%n" +
                        "Taxes: %.2f$%n" +
                        "-----------%n" +
                        "Total price: %.2f$", totalPrice, totalPrice * 0.2, totalPrice * 1.2 * 0.9);
            else
                System.out.printf("Congratulations you've just bought a new computer!%n" +
                        "Price without taxes: %.2f$%n" +
                        "Taxes: %.2f$%n" +
                        "-----------%n" +
                        "Total price: %.2f$", totalPrice, totalPrice * 0.2, totalPrice * 1.2);
        }
    }
}

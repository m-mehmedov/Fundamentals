package MidExam;

import java.util.Scanner;

public class E01_BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCities = Integer.parseInt(scanner.nextLine());
        double totalProfit = 0;

        for (int i = 1; i <= numberOfCities; i++) {
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0 && i % 5 != 0)
                expenses *= 1.5;

            if (i % 5 == 0)
                income *= 0.9;

            double profit = income - expenses;
            totalProfit += profit;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}

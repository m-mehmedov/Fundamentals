package ExamPreparation150223;

import java.util.Scanner;

public class E01_BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double totalPlunder = 0;
        for (int day = 1; day <= days; day++) {

            double currentPlunder = 0;

            if(day % 3 == 0){
                currentPlunder = dailyPlunder * 1.5;
            }
            else {
                currentPlunder = dailyPlunder;
            }
            totalPlunder += currentPlunder;
            if(day % 5 == 0){
                totalPlunder *= 0.7;
            }

        }

        if (totalPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        }
        else {
            System.out.printf("Collected only %.2f%% of the plunder.", (totalPlunder / expectedPlunder) * 100);
        }

    }
}

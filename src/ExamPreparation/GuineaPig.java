package ExamPreparation;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double foodQuantity = Double.parseDouble(scanner.nextLine());
        double hayQuantity = Double.parseDouble(scanner.nextLine());
        double coverQuantity = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());
        int day = 1;

        boolean goToStore = false;

        while (day <= 30){

            foodQuantity -= 0.3;

            if (day % 2 == 0)
                hayQuantity -= 0.05 * foodQuantity;

            if (day % 3 == 0)
                coverQuantity -= weight/3;
            if (foodQuantity <= 0.00000001 || hayQuantity <= 0.00000001 || coverQuantity <= 0.00000001){
                goToStore = true;
                break;
            }
            day++;
        }
        if (goToStore)
            System.out.println("Merry must go to the pet store!");
        else
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodQuantity, hayQuantity, coverQuantity);
    }
}

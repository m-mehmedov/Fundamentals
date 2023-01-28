package BasixSyntax;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyAmount = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double totalSabersPrice = Math.ceil(studentCount * 1.1) * saberPrice;
        double totalRobesPrice = studentCount * robePrice;
        int freeBeltsQuantity = studentCount / 6;
        double totalBeltsPrice = (studentCount - freeBeltsQuantity) * beltPrice;
        double totalPrice = totalSabersPrice + totalRobesPrice + totalBeltsPrice;

        if (moneyAmount >= totalPrice)
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalPrice);
        else
            System.out.printf("George Lucas will need %.2flv more.%n", totalPrice - moneyAmount);
    }
}

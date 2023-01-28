package BasixSyntax;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        float pricePerPerson = 0;
        float totalPrice = 0;

        if (groupType.equals("Students")) {
            if (day.equals("Friday"))
                pricePerPerson = 8.45F;
            else if (day.equals("Saturday"))
                pricePerPerson = 9.80F;
            else if (day.equals("Sunday"))
                pricePerPerson = 10.46F;
            if (quantity >= 30)
                pricePerPerson *= 0.85F;
        }
        else if (groupType.equals("Business")) {
            if (day.equals("Friday"))
                pricePerPerson = 10.90F;
            else if (day.equals("Saturday"))
                pricePerPerson = 15.60F;
            else if (day.equals("Sunday"))
                pricePerPerson = 16F;
            if (quantity >= 100)
                quantity -= 10;
        }
        else if (groupType.equals("Regular")) {
            if (day.equals("Friday"))
                pricePerPerson = 15F;
            else if (day.equals("Saturday"))
                pricePerPerson = 20F;
            else if (day.equals("Sunday"))
                pricePerPerson = 22.50F;
            if (quantity >= 10 && quantity <= 20)
                pricePerPerson *= 0.95F;
        }

        totalPrice = quantity * pricePerPerson;
        System.out.printf("Total price: %.2f", totalPrice);
    }
}

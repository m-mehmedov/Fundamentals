package BasixSyntax;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        double coin = 0;
        double sum = 0;
        String product = "";
        double productPrice = 0;

        while (!inputLine.equals("Start")){
            coin = Double.parseDouble(inputLine);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2)
                sum += coin;
            else
                System.out.printf("Cannot accept %.2f%n", coin);
            inputLine = scanner.nextLine();
        }
        inputLine = scanner.nextLine();
        while (!inputLine.equals("End")){
            product = inputLine;
            switch (product){
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    productPrice = 0;
                    break;
            }
            if (productPrice == 0){
                System.out.println("Invalid product");
                inputLine = scanner.nextLine();
                continue;
            }
            else{
                if (sum < productPrice)
                    System.out.println("Sorry, not enough money");
                else {
                    sum -= productPrice;
                    System.out.printf("Purchased %s%n", product);
                }
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", sum);
    }
}

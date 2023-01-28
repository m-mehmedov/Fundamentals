package BasicSyntaxMore;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        String inputLine = scanner.nextLine();
        String gameName = "";
        double gamePrice = 0;
        double totalSpent = 0;

        while (!inputLine.equals("Game Time")){
            gameName = inputLine;

            switch (gameName){
                case "OutFall 4":                  gamePrice = 39.99; break;
                case "CS: OG":                     gamePrice = 15.99; break;
                case "Zplinter Zell":              gamePrice = 19.99; break;
                case "Honored 2":                  gamePrice = 59.99; break;
                case "RoverWatch":                 gamePrice = 29.99; break;
                case "RoverWatch Origins Edition": gamePrice = 39.99; break;
                default:                           gamePrice = 0;     break;
            }

            if (gamePrice == 0){
                System.out.println("Not Found");
                inputLine = scanner.nextLine();
                continue;
            }
            /*if (balance == 0){
                System.out.println("Out of money");
                break;
            }*/
            else if (balance < gamePrice){
                System.out.println("Too Expensive");
                inputLine = scanner.nextLine();
                continue;
            }
            totalSpent += gamePrice;
            balance -= gamePrice;
            System.out.printf("Bought %s%n", gameName);
            if (balance == 0){
                System.out.println("Out of money");
                return;
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, balance);
    }
}

package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Go Shopping!")){
            String command = inputLine.split(" ")[0];

            switch (command){

                case "Urgent":
                    String urgentItem = inputLine.split(" ")[1];
                    if (!shoppingList.contains(urgentItem))
                        shoppingList.add(0, urgentItem);
                    break;
                case "Unnecessary":
                    String unnecessaryItem = inputLine.split(" ")[1];
                    shoppingList.remove(unnecessaryItem);
                    break;
                case "Correct":
                    String oldItem = inputLine.split(" ")[1];
                    String newItem = inputLine.split(" ")[2];
                    if (shoppingList.contains(oldItem)) {
                        shoppingList.add(shoppingList.indexOf(oldItem), newItem);
                        shoppingList.remove(oldItem);
                    }
                    break;
                case "Rearrange":
                    String rearrangeItem = inputLine.split(" ")[1];
                    if (shoppingList.contains(rearrangeItem)) {
                        shoppingList.add(rearrangeItem);
                        shoppingList.remove(rearrangeItem);
                    }
                    break;
                default:
                    break;
            }

            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(" ", shoppingList.toString().replaceAll("[\\[\\],]", "").replaceAll(" ", ", ")));
    }
}

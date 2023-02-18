package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Craft!")){
            String command = inputLine.split(" - ")[0];
            String item = inputLine.split(" - ")[1];

            switch (command){
                case "Collect":
                    if (!items.contains(item))
                        items.add(item);
                    break;
                case "Drop":
                    items.remove(item);
                    break;
                case "Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    if (items.contains(oldItem))
                        items.add(items.indexOf(oldItem) + 1, newItem);
                    break;
                case "Renew":
                    if (items.contains(item)) {
                        items.add(item);
                        items.remove(item);
                    }
                    break;
                default:
                    break;
            }

            inputLine = scanner.nextLine();
        }

        System.out.println(String.join(" ", items.toString().replaceAll("[\\[\\],]", "").replaceAll(" ", ", ")));
    }
}

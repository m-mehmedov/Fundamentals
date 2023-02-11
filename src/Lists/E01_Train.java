package Lists;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagon = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")){

            if (inputLine.contains("Add")) {
                int passengers = Integer.parseInt(inputLine.split(" ")[1]);
                wagon.add(passengers);
            }
            else {
                int passengers = Integer.parseInt(inputLine);
                for (int i = 0; i < wagon.size(); i++) {
                    if (wagon.get(i) + passengers <= maxCapacity) {
                        wagon.set(i, wagon.get(i) + passengers);
                        break;
                    }
                }
            }


            inputLine = scanner.nextLine();
        }

        System.out.println(String.join(" ", wagon.toString().replaceAll("[\\[\\],]", "")));

    }
}

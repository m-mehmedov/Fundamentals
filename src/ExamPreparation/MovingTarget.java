package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")){

            String[] inputString = inputLine.split(" ");
            String command = inputString[0];

            switch (command) {
                case "Shoot":

                    int shootIndex = Integer.parseInt(inputString[1]);
                    int power = Integer.parseInt(inputString[2]);
                    if (shootIndex >= 0 && shootIndex < targets.size()) {
                        targets.set(shootIndex, targets.get(shootIndex) - power);
                        if (targets.get(shootIndex) <= 0)
                            targets.remove(shootIndex);
                    }
                    break;

                case "Add":

                    int addIndex = Integer.parseInt(inputString[1]);
                    int value = Integer.parseInt(inputString[2]);
                    if (addIndex >= 0 && addIndex < targets.size())
                        targets.add(addIndex, value);
                    else
                        System.out.println("Invalid placement!");
                    break;

                case "Strike":

                    int strikeIndex = Integer.parseInt(inputString[1]);
                    int radius = Integer.parseInt(inputString[2]);
                    if (strikeIndex - radius >= 0 && strikeIndex + radius < targets.size()) {
                        for (int i = 0; i < radius; i++)
                            targets.remove(strikeIndex + 1);
                        for (int i = 0; i < radius; i++) {
                            targets.remove(strikeIndex - 1);
                        }
                        targets.remove(strikeIndex - radius);
                    }
                    else
                        System.out.println("Strike missed!");
                    break;

                default: break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(" ",targets.toString().replaceAll("[\\[\\],]","").replaceAll(" ", "|")));
    }
}

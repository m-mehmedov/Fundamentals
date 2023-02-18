package ExamPreparation130223;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03_MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        int count = 0;

        while (!inputLine.equals("end")){

            int firstIndex = Integer.parseInt(inputLine.split(" ")[0]);
            int secondIndex = Integer.parseInt(inputLine.split(" ")[1]);
            count++;

            if (firstIndex == secondIndex
                    || firstIndex < 0 || firstIndex >= elements.size()
                    || secondIndex < 0 || secondIndex >= elements.size()){
                int insertIndex = elements.size() / 2;
                elements.add(insertIndex, "-" + count + "a");
                elements.add(insertIndex, "-" + count + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            }
            else {
                if (elements.get(firstIndex).equals(elements.get(secondIndex))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", elements.get(secondIndex));
                    elements.remove(Math.max(firstIndex, secondIndex));
                    elements.remove(Math.min(firstIndex, secondIndex));
                } else
                    System.out.println("Try again!");
            }
            if (elements.size() == 0) {
                System.out.printf("You have won in %d turns!", count);
                break;
            }

            inputLine = scanner.nextLine();
        }
        if (elements.size() > 0){
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elements.toString().replaceAll("[\\[\\],]", "")));
        }
    }
}

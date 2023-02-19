package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersArray = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Finish")){

            String[] inputString = inputLine.split(" ");
            String command = inputString[0];
            int value = Integer.parseInt(inputLine.split(" ")[1]);
            switch (command) {
                case "Add":
                    numbersArray.add(value);
                    break;
                case "Remove":
                    numbersArray.remove(Integer.valueOf(value));
                    break;
                case "Replace":
                    int replacement = Integer.parseInt(inputLine.split(" ")[2]);
                    numbersArray.set(numbersArray.indexOf(value), replacement);
                    break;
                case "Collapse":
                    numbersArray.removeIf(integer -> integer < value);
                    break;
                default: break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(" ",numbersArray.toString().replaceAll("[\\[\\],]","")));
    }
}


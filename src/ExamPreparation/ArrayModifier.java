package ExamPreparation;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersArray = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        int index1 = 0;
        int index2 = 0;
        int firstNumber = 0;
        int secondNumber = 0;

        while (!inputLine.equals("end")){

            String[] inputString = inputLine.split(" ");
            String command = inputString[0];

            switch (command) {
                case "swap":
                    index1 = Integer.parseInt(inputString[1]);
                    index2 = Integer.parseInt(inputString[2]);
                    firstNumber = numbersArray.get(index1);
                    secondNumber = numbersArray.get(index2);
                    numbersArray.set(index1, secondNumber);
                    numbersArray.set(index2, firstNumber);
                    break;
                case "multiply":
                    index1 = Integer.parseInt(inputString[1]);
                    index2 = Integer.parseInt(inputString[2]);
                    numbersArray.set(index1, numbersArray.get(index1) * numbersArray.get(index2));
                    break;
                case "decrease":
                    numbersArray.replaceAll(integer -> integer - 1);
                    break;
                default: break;
            }
            inputLine = scanner.nextLine();

        }
        System.out.println(String.join(" ",numbersArray.toString().replaceAll("[\\[\\],]","").replaceAll(" ", ", ")));
    }
}

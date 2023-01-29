package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
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
                    firstNumber = numbersArr[index1];
                    secondNumber = numbersArr[index2];
                    numbersArr[index1] = secondNumber;
                    numbersArr[index2] = firstNumber;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(inputString[1]);
                    index2 = Integer.parseInt(inputString[2]);
                    numbersArr[index1] *= numbersArr[index2];
                    break;
                case "decrease":
                    for (int i = 0; i < numbersArr.length; i++) {
                        numbersArr[i]--;
                    }
                    break;
                default: break;
            }
            inputLine = scanner.nextLine();

        }
        for (int i = 0; i < numbersArr.length; i++) {
            if(i < numbersArr.length - 1)
                System.out.printf("%d, ", numbersArr[i]);
            else
                System.out.println(numbersArr[i]);
        }
    }
}

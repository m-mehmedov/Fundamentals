package DataTypesandVariablesMore;

import java.math.BigInteger;
import java.util.Scanner;

public class E02_FromLeftToTheRight {
    public static int sumDigits(BigInteger number) {
        int sum = 0;
        String numberString = number.toString();

        if(numberString.startsWith("-"))
            numberString = numberString.substring(1);

        for (int i = 0; i < numberString.length(); i++)
            sum += (int)(numberString.charAt(i) - '0');

        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        for (int i = 0; i < number; i++) {
            String currentStr = scanner.nextLine();
            Scanner localScanner = new Scanner(currentStr);
            BigInteger firstNumber, secondNumber;
            firstNumber = new BigInteger(localScanner.next());
            secondNumber = new BigInteger(localScanner.next());

            if (firstNumber.compareTo(secondNumber) > 0)
                sumOfDigits = sumDigits(firstNumber);
            else
                sumOfDigits = sumDigits(secondNumber);
            System.out.println(sumOfDigits);
        }
    }
}

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E07_MaxSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxCount = Integer.MIN_VALUE;
        int magicNumber = 0;
        int counter = 1;

        for (int i = numbersArr.length - 1; i > 0; i--) {

            if(numbersArr[i] == numbersArr[i-1])
                counter++;
            else
                counter = 1;

            if(counter >= maxCount) {
                maxCount = counter;
                magicNumber = numbersArr[i];
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.printf("%d ", magicNumber);
        }
    }
}

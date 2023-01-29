package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            int firstElement = numbersArr[0];

            for (int j = 0; j < numbersArr.length - 1; j++) {
                numbersArr[j] = numbersArr[j+1];
            }

            numbersArr[numbersArr.length - 1] = firstElement;
        }
        for (int j : numbersArr) {
            System.out.printf("%d ", j);
        }
   }
}



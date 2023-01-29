package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        //1 7 6 2 19 23

        for (int i = 0; i < numbersArr.length; i++) {
            for (int j = i; j < numbersArr.length; j++) {
                if (i != j)
                    if (numbersArr[i] + numbersArr[j] == magicSum)
                        System.out.printf("%d %d%n", numbersArr[i], numbersArr[j]);
            }
        }
    }
}

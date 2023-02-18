package ExamPreparation150223;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        for(int num : integers)
            sum += num;

        double avg = (double) sum / integers.size();

        integers.sort(Comparator.reverseOrder());

        boolean printedIntegers = false;

        if (integers.size() >= 5)
            for (int i = 0; i < 5; i++) {
                if (integers.get(i) > avg) {
                    System.out.print(integers.get(i) + " ");
                    printedIntegers = true;
                }
            }
        else
            for (Integer integer : integers) {
                if (integer > avg) {
                    System.out.print(integer + " ");
                    printedIntegers = true;
                }
            }
        if (!printedIntegers)
            System.out.println("No");
    }
}

package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03_TheAngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String itemsType = scanner.nextLine();
        int leftSum = 0;
        int rightSum = 0;

        if (itemsType.equals("cheap")){
            for (int i = entryPoint + 1; i < priceRatings.size(); i++)
                if (priceRatings.get(i) < priceRatings.get(entryPoint))
                    rightSum += priceRatings.get(i);
            for (int i = 0; i < entryPoint; i++)
                if (priceRatings.get(i) < priceRatings.get(entryPoint))
                    leftSum += priceRatings.get(i);
        }
        else {
            for (int i = entryPoint + 1; i < priceRatings.size(); i++)
                if (priceRatings.get(i) >= priceRatings.get(entryPoint))
                    rightSum += priceRatings.get(i);
            for (int i = 0; i < entryPoint; i++)
                if (priceRatings.get(i) >= priceRatings.get(entryPoint))
                    leftSum += priceRatings.get(i);
        }
        if (leftSum >= rightSum)
            System.out.println("Left - " + leftSum);
        else
            System.out.println("Right - " + rightSum);
    }
}

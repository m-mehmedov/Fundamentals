package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = scanner.nextInt();
        int bombPower = scanner.nextInt();

        for (int i = 0; i < numbers.size(); i++) {
            int detonationIndex = numbers.indexOf(bombNumber);
            if (detonationIndex < 0)
                break;
            for (int j = 0; j < bombPower; j++) {
                if (detonationIndex + 1 < numbers.size() )
                    numbers.remove(detonationIndex + 1);
            }
            for (int j = 0; j < bombPower; j++) {
                if (detonationIndex - 1 >= 0 )
                    numbers.remove(detonationIndex - 1);
                detonationIndex = numbers.indexOf(bombNumber);
            }
            if (detonationIndex  >= 0 && detonationIndex < numbers.size())
                numbers.remove(detonationIndex);
        }

        int sum = 0;
        for (int number : numbers)
            sum += number;

        System.out.println(sum);
    }
}

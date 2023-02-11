package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list;
        list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNumber = scanner.nextInt();
        int bombPower = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {

            int detonationIndex = list.indexOf(bombNumber);
            if (detonationIndex <= 0)
                break;
            for (int j = 0; j < bombPower; j++) {
                if (detonationIndex < list.size())
                    list.remove(detonationIndex - 1);
                if (detonationIndex < list.size())
                    list.remove(detonationIndex);
                detonationIndex = list.indexOf(bombNumber);
            }
            list.remove(detonationIndex);
        }

        int sum = 0;
        for (int number : list)
            sum += number;

        System.out.println(sum);
    }
}

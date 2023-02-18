package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> neighbourhood = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        String inputLine = scanner.nextLine();
        int index = 0;

        while (!inputLine.equals("Love!")){
            int jumpLength = Integer.parseInt(inputLine.split(" ")[1]);
            index += jumpLength;

            if (index >= neighbourhood.size())
                index = 0;
            if (neighbourhood.get(index).equals(0)){
                System.out.printf("Place %d already had Valentine's day.%n", index);
                inputLine = scanner.nextLine();
                continue;
            }
            else
                neighbourhood.set(index, neighbourhood.get(index) - 2);

            if (neighbourhood.get(index).equals(0))
                System.out.printf("Place %d has Valentine's day.%n", index);

            inputLine = scanner.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", index);

        int count = 0;

        for (int house : neighbourhood)
            if (house > 0)
                count++;

        if (count > 0)
            System.out.printf("Cupid has failed %d places.", count);
        else
            System.out.println("Mission was successful.");

    }
}

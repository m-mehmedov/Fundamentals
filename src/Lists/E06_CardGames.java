package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06_CardGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerHand;
        List<Integer> secondPlayerHand;
        firstPlayerHand = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        secondPlayerHand = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerHand.size() > 0 && secondPlayerHand.size() > 0){
            int firstPlayerCard = firstPlayerHand.get(0);
            int secondPlayerCard = secondPlayerHand.get(0);

            firstPlayerHand.remove(0);
            secondPlayerHand.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerHand.add(firstPlayerCard);
                firstPlayerHand.add(secondPlayerCard);
                }
            else if (firstPlayerCard < secondPlayerCard){
                secondPlayerHand.add(secondPlayerCard);
                secondPlayerHand.add(firstPlayerCard);
            }
        }
        int sum = 0;

        if (secondPlayerHand.size()==0) {
            for (int card: firstPlayerHand) {
                sum += card;
            }
            System.out.println("First player wins! Sum: " + sum);
        }
        else {
            for (int card: secondPlayerHand) {
                sum += card;
            }
            System.out.println("Second player wins! Sum: " + sum);
        }
    }
}

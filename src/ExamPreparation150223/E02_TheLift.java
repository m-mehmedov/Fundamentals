package ExamPreparation150223;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        List<Integer> currentState = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < currentState.size(); i++) {
            int currentWagonSpace = 4 - currentState.get(i);
            if (waitingPeople >= currentWagonSpace) {
                currentState.set(i, currentState.get(i) + currentWagonSpace);
                waitingPeople -= currentWagonSpace;
            }
            else {
                currentState.set(i, currentState.get(i) + waitingPeople);
                waitingPeople = 0;
            }
        }
        if (waitingPeople == 0 && currentState.get(currentState.size() - 1) < 4)
            System.out.println("The lift has empty spots!");
        else if (waitingPeople > 0)
            System.out.printf("There isn't enough space! %s people in a queue!%n", waitingPeople);
        System.out.println(String.join(" ", currentState.toString().replaceAll("[\\[\\],]", "")));
    }
}
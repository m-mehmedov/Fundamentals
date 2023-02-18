package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String inputLine = scanner.nextLine();

        int targetCount = 0;

        while (!inputLine.equals("End")){
            int index = Integer.parseInt(inputLine);

            if (index >= 0 && index < targets.size()) {
                targetCount++;
                for (int i = 0; i < targets.size(); i++) {
                    if (i != index && !targets.get(i).equals(-1)) {
                        if (targets.get(i) > targets.get(index))
                            targets.set(i, targets.get(i) - targets.get(index));
                        else
                            targets.set(i, targets.get(i) + targets.get(index));
                    }
                }
                targets.set(index, - 1);
            }
            inputLine = scanner.nextLine();
        }

        System.out.print("Shot targets: " + targetCount + " -> ");
        System.out.println(String.join(" ",targets.toString().replaceAll("[\\[\\],]","")));
    }
}

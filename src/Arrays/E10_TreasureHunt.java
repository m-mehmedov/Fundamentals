package Arrays;

import java.util.Scanner;

public class E10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] chest = new String[200];
        String[] initialChest = scanner.nextLine().split("\\|");
        System.arraycopy(initialChest, 0, chest, 0, initialChest.length);
        String inputLine = scanner.nextLine();
        int elementCount = 0;

        while (!inputLine.equals("Yohoho!")){

            String[] inputString = inputLine.split(" ");
            String command = inputString[0];

            elementCount = 0;
            for (String s : chest)
                if (s != null)
                    elementCount++;

            switch (command){
                case "Loot":

                    String [] loot = new String[inputString.length - 1];
                    System.arraycopy(inputString, 1, loot, 0, loot.length);

                    for (String currentItem : loot) {

                        elementCount = 0;
                        for (String s : chest)
                            if (s != null)
                                elementCount++;

                        boolean duplicateLoot = false;

                        for (int j = 0; j < elementCount + loot.length; j++) {
                            if (currentItem.equals(chest[j])) {
                                duplicateLoot = true;
                                break;
                            }
                        }
                        if (!duplicateLoot) {
                            for (int j = elementCount; j > 0; j--)
                                chest[j] = chest[j - 1];
                            chest[0] = currentItem;
                        }
                    }
                    break;

                case "Drop":

                    int index = Integer.parseInt(inputString[1]);

                    if (index < 0 || index >= elementCount) {
                        inputLine = scanner.nextLine();
                        continue;
                    }
                    else {
                        String elementToDrop = chest[index];
                        for (int i = index; i < elementCount - 1; i++)
                            chest[i] = chest[i + 1];
                        chest[elementCount - 1] = elementToDrop;
                    }
                    break;

                case "Steal":

                    int count = Integer.parseInt(inputString[1]);

                    if (count <= elementCount)
                        for (int i = elementCount - count; i < elementCount; i++) {
                            if (i < elementCount - 1) {
                                System.out.printf("%s, ", chest[i]);
                            } else {
                                System.out.println(chest[i]);
                            }
                            chest[i] = null;
                        }
                    else
                        for (int i = 0; i < elementCount; i++) {
                            if (i < elementCount - 1) {
                                System.out.printf("%s, ", chest[i]);
                            } else {
                                System.out.println(chest[i]);
                            }
                            chest[i] = null;
                        }
                    break;
                default: break;
            }

            inputLine = scanner.nextLine();
        }

        elementCount = 0;
        for (String s : chest)
            if (s != null)
                elementCount++;

        if (elementCount == 0)
            System.out.println("Failed treasure hunt.");
        else {
            int sumOfItems = 0;
            for (int i = 0; i < elementCount; i++) {
                assert chest[i] != null;
                sumOfItems += chest[i].length();
            }

            double averageTreasureGain = (double) sumOfItems / elementCount;
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        }
    }
}

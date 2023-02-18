package ExamPreparation130223;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Yohoho!")){

            List<String> inputList= Arrays.stream(inputLine.split(" ")).collect(Collectors.toList());
            String command = inputList.get(0);
            inputList.remove(0);
            switch (command){
                case "Loot":
                    for (String curLoot : inputList){
                        if (!chest.contains(curLoot))
                            chest.add(0, curLoot);
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(inputList.get(0));
                    if(index < 0 || index >= chest.size())
                    {
                        inputLine = scanner.nextLine();
                        continue;
                    }
                    String lootToRemove = chest.get(index);
                    chest.remove(index);
                    chest.add(lootToRemove);
                    break;
                case "Steal":
                    int count = Integer.parseInt(inputList.get(0));
                    int startIndex = chest.size() - count;
                    int endIndex = chest.size();
                    if(count >= chest.size())
                        startIndex = 0;
                    for (int i = startIndex; i < endIndex; i++) {
                        if (i < endIndex - 1)
                            System.out.print(chest.get(startIndex) + ", ");
                        else
                            System.out.print(chest.get(startIndex));
                        chest.remove(startIndex);
                    }

                    System.out.println();
                    break;
                default:
                    break;
            }
            inputLine = scanner.nextLine();
        }
        int sum = 0;
        for (String curItem : chest)
            sum += curItem.length();


        if (chest.size() == 0)
            System.out.println("Failed treasure hunt.");
        else
            System.out.printf("Average treasure gain: %.2f pirate credits.", (double)sum / chest.size());
    }
}

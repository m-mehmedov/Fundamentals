package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warshipStatus = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String inputLine = scanner.nextLine();
        boolean stopProgram = false;

        while (!inputLine.equals("Retire")) {

            String command = inputLine.split(" ")[0];

            switch (command){

                case "Fire":

                    int index = Integer.parseInt(inputLine.split(" ")[1]);
                    int pirateShipDamage = Integer.parseInt(inputLine.split(" ")[2]);
                    if (index >= 0 && index < warshipStatus.size()) {
                        warshipStatus.set(index, warshipStatus.get(index) - pirateShipDamage);
                        if (warshipStatus.get(index) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            stopProgram = true;
                        }
                    }
                    break;

                case "Defend":

                    int startIndex = Integer.parseInt(inputLine.split(" ")[1]);
                    int endIndex = Integer.parseInt(inputLine.split(" ")[2]);
                    int warshipDamage = Integer.parseInt(inputLine.split(" ")[3]);

                    if (startIndex >= 0 && startIndex < pirateShipStatus.size()
                            && endIndex >= 0 && endIndex < pirateShipStatus.size())
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShipStatus.set(i, pirateShipStatus.get(i) - warshipDamage);
                            if (pirateShipStatus.get(i) <= 0){
                                System.out.println("You lost! The pirate ship has sunken.");
                                stopProgram = true;
                                break;
                            }
                        }
                    break;

                case "Repair":
                    int repairIndex = Integer.parseInt(inputLine.split(" ")[1]);
                    int health = Integer.parseInt(inputLine.split(" ")[2]);

                    if (repairIndex >= 0 && repairIndex < pirateShipStatus.size()){
                        pirateShipStatus.set(repairIndex, pirateShipStatus.get(repairIndex) + health);
                        if (pirateShipStatus.get(repairIndex) > maxHealth)
                            pirateShipStatus.set(repairIndex, maxHealth);
                    }

                    break;
                case "Status":
                    int lowHealthCount = 0;
                    for (int section : pirateShipStatus)
                        if (section < (double)maxHealth / 5)
                            lowHealthCount++;
                    System.out.println(lowHealthCount + " sections need repair.");
                    break;
                default:
                    break;
            }
            if (stopProgram)
                break;
            inputLine = scanner.nextLine();
        }
        if (!stopProgram) {
            System.out.println("Pirate ship status: " + status(pirateShipStatus));
            System.out.println("Warship status: " + status(warshipStatus));
        }
    }

    public static int status(List<Integer> ship){
        int sum = 0;
        for (int section : ship)
            sum += section;
        return sum;
    }
}

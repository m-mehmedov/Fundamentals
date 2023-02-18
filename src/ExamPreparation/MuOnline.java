package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        List<String> dungeon = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        boolean dead = false;

        for (int i = 0; i < dungeon.size(); i++) {
            String command = dungeon.get(i).split(" ")[0];
            int number = Integer.parseInt(dungeon.get(i).split(" ")[1]);

            switch (command){
                case "potion":
                    int odlHealth = health;
                    health += number;
                    if (health > 100)
                        health = 100;
                    System.out.printf("You healed for %d hp.%n", health - odlHealth);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", number);
                    bitcoins += number;
                    break;
                default:
                    health -= number;
                    if (health > 0)
                        System.out.printf("You slayed %s.%n", command);
                    else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", i + 1);
                        dead = true;
                    }
                    break;
            }
            if (dead)
                break;
        }
        if (!dead){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}

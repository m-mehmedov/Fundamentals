package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commands = Integer.parseInt(scanner.nextLine());

        List<String> list = new ArrayList<>();

        for (int i = 0; i < commands; i++) {
            String inputLine = scanner.nextLine();
            if (inputLine.contains("is going!")){
                if (list.contains(inputLine.split(" ")[0]))
                    System.out.println(inputLine.split(" ")[0] + " is already in the list!");
                else
                    list.add(inputLine.split(" ")[0]);

                }
            else if (inputLine.contains("is not going!")) {
                if (list.contains(inputLine.split(" ")[0]))
                    list.remove(inputLine.split(" ")[0]);
                else
                    System.out.println(inputLine.split(" ")[0] + " is not in the list!");
            }
        }
        for (String name : list)
            System.out.println(name);
    }
}

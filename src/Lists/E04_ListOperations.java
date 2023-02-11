package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list;
        list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){

            if (command.contains("Add")){
                list.add(Integer.parseInt(command.split(" ")[1]));
            }
            else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index          = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index <= list.size()) {
                    list.add(index, numberToInsert);
                }
                else System.out.println("Invalid index");

            }
            else if (command.contains("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index <= list.size()) {
                    list.remove(index);
                }
                else System.out.println("Invalid index");
            }
            else if (command.contains("Shift left")) {
                int count = Integer.parseInt(command.split(" ")[2]);

                for (int i = 0; i < count; i++) {
                    int curNum = list.get(0);
                    list.remove(Integer.valueOf(curNum));
                    list.add(curNum);
                }
            }
            else if (command.contains("Shift right")) {
                int count = Integer.parseInt(command.split(" ")[2]);

                for (int i = count; i > 0; i--) {
                    int curNum = list.get(list.size()-1);
                    list.remove(Integer.valueOf(curNum));
                    list.add(0, curNum);
                }

            }

            command = scanner.nextLine();
        }

        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}

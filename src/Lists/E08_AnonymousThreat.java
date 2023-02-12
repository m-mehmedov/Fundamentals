package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            if (command.startsWith("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0)
                    startIndex = 0;
                else if (startIndex >= list.size()) {
                    command = scanner.nextLine();
                    continue;
                }
                if (endIndex >= list.size())
                    endIndex = list.size() - 1;
                else if (endIndex <= 0) {
                    command = scanner.nextLine();
                    continue;
                }

                list.add(startIndex, mergeElementsInList(startIndex, endIndex, list));

            } else if (command.startsWith("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int partitions = Integer.parseInt(command.split(" ")[2]);
                String elementToDivide = list.get(index);
                list.remove(index);
                List<String> dividedList = divideListElement(elementToDivide, partitions);
                if (index < list.size())
                    list.addAll(index, dividedList);
                else
                    list.addAll(dividedList);
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", list));
    }
    public static String mergeElementsInList(int start, int end, List<String> list){
        String merged = "";
        for (int i = start; i <= end; i++) {
            if (start < list.size()) {
                merged = merged.concat(list.get(start));
                list.remove(start);
            }
        }
       return merged;
    }
    public static List<String> divideListElement(String elementToDivide, int parts)
    {
        List<String> dividedList = new ArrayList<>();

        int length = elementToDivide.length() / parts;
        int lastElementLength = elementToDivide.length() % parts + length;
        for (int i = 0; i < parts; i++) {
            if(i < parts - 1)
                dividedList.add(elementToDivide.substring(i * length, length + i * length));
            else
                dividedList.add(elementToDivide.substring(i * length, lastElementLength  + i * length));
        }

        return dividedList;
    }
}

package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class E02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")){

            if (inputLine.contains("Insert")) {
                int elementToAdd = Integer.parseInt(inputLine.split(" ")[1]);
                int index = Integer.parseInt(inputLine.split(" ")[2]);

                list.add(index, elementToAdd);
            }
            else if(inputLine.contains("Delete")) {
                int elementToRemove = Integer.parseInt(inputLine.split(" ")[1]);
                list.removeAll(Collections.singleton(elementToRemove));
            }

            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(" ", list.toString().replaceAll("[\\[\\],]", "")));
    }
}

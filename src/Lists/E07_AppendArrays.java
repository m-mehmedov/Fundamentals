package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputLine = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<List<Integer>> arrayList = new ArrayList<>();

        for (String curString : inputLine) {
            curString = curString.stripLeading();
            List<Integer> curArray = Arrays.stream(curString.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
            arrayList.add(curArray);
        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            printArray(arrayList.get(i));
        }
    }
    public static void printArray(List<Integer> arrayToPrint){
        System.out.print(arrayToPrint.toString().replaceAll("[\\[\\],]", "") + " ");
    }
}
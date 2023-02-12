package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E07_AppendArraysNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputLine = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> resultList = new ArrayList<>();

        for (int i = inputLine.size() - 1; i >= 0; i--) {
           String curString = inputLine.get(i).trim();
           if (!curString.equals(""))
               resultList.addAll(Arrays.stream(curString.split("\\s+")).collect(Collectors.toList()));
        }
        System.out.print(resultList.toString().replaceAll("[\\[\\],]", "") + " ");
    }
}
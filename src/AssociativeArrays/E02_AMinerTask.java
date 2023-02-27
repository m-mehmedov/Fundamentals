package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("stop")){
            int amount = Integer.parseInt(scanner.nextLine());
            if (!resourcesMap.containsKey(inputLine))
                resourcesMap.put(inputLine, amount);
            else {
                int value = resourcesMap.get(inputLine);
                resourcesMap.put(inputLine, value + amount);
            }
            inputLine = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()){
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}

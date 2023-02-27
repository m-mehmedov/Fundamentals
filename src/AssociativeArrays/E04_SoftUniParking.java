package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> parkingMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        String name = "";
        String plate = "";
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String command = inputLine.split(" ")[0];
            name = inputLine.split(" ")[1];

            switch (command) {
                case "register":
                    plate = inputLine.split(" ")[2];
                    if (!parkingMap.containsKey(name)) {
                        parkingMap.put(name, plate);
                        System.out.printf("%s registered %s successfully%n", name, plate);
                    }
                    else
                        System.out.printf("ERROR: already registered with plate number %s%n", parkingMap.get(name));
                    break;
                case "unregister":
                    if (!parkingMap.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    else {
                        System.out.printf("%s unregistered successfully%n", name);
                        parkingMap.remove(name);
                    }
                    break;
                default: break;
            }
        }

        for (Map.Entry<String,String> entry : parkingMap.entrySet())
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
    }
}

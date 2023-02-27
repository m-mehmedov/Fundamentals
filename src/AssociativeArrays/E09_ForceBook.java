package AssociativeArrays;

import java.util.*;

public class E09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> forceSidesMap = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Lumpawaroo")){
            String side = "";
            String user = "";
            List<String> usersList = new ArrayList<>();
            boolean userExists = false;

            if (inputLine.contains("|")) {
                side = inputLine.split(" \\| ")[0];
                user = inputLine.split("\\|")[1].trim();

                if (!forceSidesMap.containsKey(side))
                    forceSidesMap.put(side, usersList);

                for (Map.Entry<String, List<String>> entry : forceSidesMap.entrySet())
                    if (entry.getValue().contains(user)) {
                        userExists = true;
                        break;
                    }

                if (!userExists){
                    usersList = forceSidesMap.get(side);
                    usersList.add(user);
                    forceSidesMap.put(side, usersList);
                }
            }
            else {
                user = inputLine.split(" -> ")[0];
                side = inputLine.split(" -> ")[1].trim();

                for (Map.Entry<String, List<String>> entry : forceSidesMap.entrySet())
                    if (entry.getValue().contains(user)) {
                        entry.getValue().remove(user);
                        break;
                    }

                if (!forceSidesMap.containsKey(side))
                    forceSidesMap.put(side, usersList);

                usersList = forceSidesMap.get(side);
                usersList.add(user);
                forceSidesMap.put(side, usersList);
                System.out.printf("%s joins the %s side!%n", user, side);
            }

            inputLine = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : forceSidesMap.entrySet())
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (String member : entry.getValue())
                    System.out.printf("! %s%n", member);
            }
    }
}

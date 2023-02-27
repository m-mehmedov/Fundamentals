package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class E07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        String legendary = "";
        boolean legendaryFound = false;

        while (!legendaryFound){
            List<String> lootsString = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            if (lootsString.size() % 2 == 0) {
                for (int i = 0; i < lootsString.size(); i += 2) {

                    int value = Integer.parseInt(lootsString.get(i));
                    String key = lootsString.get(i + 1).toLowerCase();

                    if (materialsMap.containsKey(key))
                        value += materialsMap.get(key);

                    materialsMap.put(key, value);

                    if (materialsMap.get("shards") >= 250) {
                        legendary = "Shadowmourne";
                        materialsMap.put("shards", materialsMap.get("shards") - 250);
                        legendaryFound = true;
                        break;
                    }
                    if (materialsMap.get("fragments") >= 250) {
                        legendary = "Valanyr";
                        materialsMap.put("fragments", materialsMap.get("fragments") - 250);
                        legendaryFound = true;
                        break;
                    }
                    if (materialsMap.get("motes") >= 250) {
                        legendary = "Dragonwrath";
                        materialsMap.put("motes", materialsMap.get("motes") - 250);
                        legendaryFound = true;
                        break;
                    }
                }
            }
        }
        System.out.println(legendary + " obtained!");
        for (Map.Entry<String, Integer> entry : materialsMap.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}

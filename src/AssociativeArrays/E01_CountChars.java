package AssociativeArrays;

import java.util.*;

public class E01_CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

        LinkedHashMap<Character, Integer> characterIntegerMap = new LinkedHashMap<>();

        for (int i = 0; i < inputLine.length(); i++) {
            if (inputLine.charAt(i) != ' ') {
               if(!characterIntegerMap.containsKey(inputLine.charAt(i))){
                   characterIntegerMap.put(inputLine.charAt(i), 1);
               }
               else {
                   int value = characterIntegerMap.get(inputLine.charAt(i));
                   characterIntegerMap.put(inputLine.charAt(i), value + 1);
               }
            }
        }
        for (Map.Entry<Character, Integer> e: characterIntegerMap.entrySet()) {
            System.out.printf("%s -> %d%n",e.getKey(),e.getValue());
        }
    }
}

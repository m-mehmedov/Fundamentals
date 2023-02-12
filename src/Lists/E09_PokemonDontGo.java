package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E09_PokemonDontGo {

    public static int sum = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (distances.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            int lastIndex = distances.size() - 1;
            int curDistance;
            if (index < 0){
                curDistance = distances.get(0);
                removeAndSum(0, distances);
                distances.add(0, distances.get(lastIndex - 1));
                modifyList(curDistance, distances);
            } else if (index > lastIndex) {
                curDistance = distances.get(lastIndex);
                removeAndSum(lastIndex, distances);
                distances.add(distances.get(0));
                modifyList(curDistance, distances);
            }else {
                curDistance = distances.get(index);
                removeAndSum(index, distances);
                modifyList(curDistance, distances);
            }
        }

        System.out.println(sum);
    }
    public static void removeAndSum(int index, List<Integer> ListToModify){
        int curDistance = ListToModify.get(index);
        ListToModify.remove(index);
        sum += curDistance;
    }
    public static void modifyList(int number, List<Integer> listToModify){
        for (int i = 0; i < listToModify.size(); i++) {
            if (listToModify.get(i) <= number)
                listToModify.set(i, listToModify.get(i) + number);
            else
                listToModify.set(i, listToModify.get(i) - number);
        }
    }
}

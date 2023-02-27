package AssociativeArrays;

import java.util.*;

public class E06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            List<Double> gradesList = new ArrayList<>();

            if (studentsMap.containsKey(name))
                gradesList = studentsMap.get(name);

            gradesList.add(grade);
            studentsMap.put(name, gradesList);
        }

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()){
            double average = entry.getValue().stream()
                    .mapToDouble(a -> a)
                    .average().getAsDouble();
            if (average >= 4.5)
                System.out.printf("%s -> %.2f%n", entry.getKey(), average);
        }
    }
}

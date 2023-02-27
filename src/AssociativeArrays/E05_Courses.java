package AssociativeArrays;

import java.util.*;

public class E05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> coursesMap = new LinkedHashMap<>();
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("end")){

            String courseName = inputLine.split(" : ")[0];
            String studentName = inputLine.split(" : ")[1];
            List<String> studentsList = new ArrayList<>();

            if (coursesMap.containsKey(courseName))
                studentsList = coursesMap.get(courseName);

            studentsList.add(studentName);
            coursesMap.put(courseName, studentsList);
            inputLine = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }
    }
}

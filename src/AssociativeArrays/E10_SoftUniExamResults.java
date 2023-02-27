package AssociativeArrays;

import java.util.*;

public class E10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<List<String>, Integer> resultsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> usersPointsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissionsMap = new LinkedHashMap<>();

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("exam finished")){
            String userName = inputLine.split("-")[0];

            if (inputLine.contains("banned")){
                usersPointsMap.remove(userName);
            }
            else {
                String language = inputLine.split("-")[1];
                int points = Integer.parseInt(inputLine.split("-")[2]);
                int submissions = 1;
                boolean addPoints = true;

                List<String> currentSubmission = new ArrayList<>();
                currentSubmission.add(userName);
                currentSubmission.add(language);

                if (resultsMap.containsKey(currentSubmission)){
                    addPoints = false;
                    int oldPoints = resultsMap.get(currentSubmission);
                    if (oldPoints > points)
                        points = oldPoints;
                }
                resultsMap.put(currentSubmission,points);

                if (usersPointsMap.containsKey(userName) && addPoints)
                    points += usersPointsMap.get(userName);
                usersPointsMap.put(userName, points);

                if (submissionsMap.containsKey(language))
                    submissions += submissionsMap.get(language);
                submissionsMap.put(language, submissions);

            }

            inputLine = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : usersPointsMap.entrySet())
            System.out.println(entry.getKey() + " | " + entry.getValue());

        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : submissionsMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}

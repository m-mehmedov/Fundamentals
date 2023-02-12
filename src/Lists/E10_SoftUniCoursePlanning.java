package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")){

            String operation = command.split(":")[0];
            String lessonTitle = command.split(":")[1];
            String exerciseTitle = lessonTitle + "-Exercise";

            switch (operation) {
                case "Add":
                    if (!lessons.contains(lessonTitle))
                        lessons.add(lessonTitle);
                    break;
                case "Insert":
                    int index = Integer.parseInt(command.split(":")[2]);
                    if (!lessons.contains(lessonTitle))
                        lessons.add(index, lessonTitle);
                    break;
                case "Remove":
                    lessons.remove(lessonTitle);
                    lessons.remove(exerciseTitle);
                    break;
                case "Swap":
                    String secondLessonTitle = command.split(":")[2];
                    if (lessons.contains(lessonTitle) && lessons.contains(secondLessonTitle)){

                        int firstIndex = lessons.indexOf(lessonTitle);
                        int secondIndex = lessons.indexOf(secondLessonTitle);

                        String firstLesson = lessons.get(firstIndex);
                        String secondLesson = lessons.get(secondIndex);

                        lessons.set(firstIndex, secondLesson);
                        lessons.set(secondIndex, firstLesson);


                        String firstExercise = firstLesson + "-Exercise";
                        String secondExercise = secondLesson + "-Exercise";

                        if (lessons.contains(firstExercise)) {
                            index = lessons.indexOf(firstExercise);
                            lessons.add(secondIndex + 1, firstExercise);
                            if (secondIndex < index)
                                lessons.remove(index + 1);
                            else
                                lessons.remove(index);
                        }
                        if (lessons.contains(secondExercise)){
                            index = lessons.indexOf(secondExercise);
                            lessons.add(firstIndex + 1, secondExercise);
                            if (firstIndex < index)
                                lessons.remove(index + 1);
                            else
                                lessons.remove(index);
                        }
                    }
                    break;
                case "Exercise":

                    if (lessons.contains(lessonTitle)){
                        if (!lessons.contains(exerciseTitle))
                            lessons.add(lessons.indexOf(lessonTitle) + 1, exerciseTitle);
                    }
                    else {
                        lessons.add(lessonTitle);
                        lessons.add(exerciseTitle);
                    }
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < lessons.size(); i++) {
            System.out.println(i + 1 + "." + lessons.get(i));
        }
    }
}

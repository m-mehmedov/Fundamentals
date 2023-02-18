package ExamPreparation;

import java.util.*;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        List<Double> totalBonuses = new ArrayList<>();
        List<Integer> studentAttendances = new ArrayList<>();
        double totalBonus = 0;
        double maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            int currentStudentAttendance = Integer.parseInt(scanner.nextLine());
            totalBonus = (double) currentStudentAttendance / numberOfLectures * (5 + additionalBonus);
            totalBonuses.add(totalBonus);
            studentAttendances.add(currentStudentAttendance);
        }
        for (double bonus: totalBonuses)
            if (bonus > maxBonus)
                maxBonus = bonus;
        for (int attendance : studentAttendances)
            if (attendance > maxAttendance)
                maxAttendance = attendance;
        System.out.printf("Max Bonus: %d.%n",(int)Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);

    }
}

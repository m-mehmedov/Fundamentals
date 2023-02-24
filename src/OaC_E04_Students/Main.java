package OaC_E04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String inputLine = scanner.nextLine();
            String firstName = inputLine.split("\\s+")[0];
            String secondName = inputLine.split("\\s+")[1];
            double grade = Double.parseDouble(inputLine.split("\\s+")[2]);
            Student curStudent = new Student(firstName, secondName, grade);
            students.add(curStudent);
        }
        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students)
            System.out.printf("%s %s: %.2f%n",student.getFirstName(), student.getSecondName(), student.getGrade());
    }
}

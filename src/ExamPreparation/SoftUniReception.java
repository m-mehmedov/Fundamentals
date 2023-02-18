package ExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int time = 0;

        while (studentCount > 0){
            studentCount -= (firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency);
            time++;
            if (time % 4 == 0)
                time++;
        }

        System.out.printf("Time needed: %dh.", time);
    }
}

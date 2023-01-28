package BasixSyntax;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int factorial = 1;
        int sum = 0;
        int curNumber = number;

        while (curNumber > 0){
            int curDigit = curNumber % 10;
            curNumber = curNumber / 10;
            for (int curNum = curDigit; curNum >= 1; curNum--) {
                factorial *= curNum;
            }
            sum += factorial;
            factorial = 1;
        }

        if (sum == number)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

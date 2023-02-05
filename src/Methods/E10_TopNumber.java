package Methods;

import java.util.Scanner;

public class E10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            if (isDivisibleByEight(i) && checkForOddDigit(i))
                System.out.println(i);
        }
    }

    public static boolean isDivisibleByEight(int num){
        int sum = 0;
        while (num > 0){
            int curDigit = num % 10;
            num /= 10;
            sum += curDigit;
        }
        return sum % 8 == 0;
    }
    public static boolean checkForOddDigit(int num){
        boolean isOdd = false;
        while (num > 0){
            int curDigit = num % 10;
            num /= 10;
            if (curDigit % 2 != 0)
                isOdd = true;
        }
        return isOdd;
    }
}

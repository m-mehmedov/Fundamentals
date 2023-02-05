package Methods;

import java.util.Scanner;

public class E08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", (double)calcFactorial(firstNum)/calcFactorial(secondNum));
    }

    public static long calcFactorial(int num){
        long factorial = 1;

        for (int i = 2; i <= Math.abs(num); i++)
            factorial *= i;
        if (num < 0)
            factorial = -factorial;
        return factorial;
    }

}

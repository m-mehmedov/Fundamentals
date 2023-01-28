package DataTypesandVariables;

import java.util.Scanner;

public class E10_pokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        double halfPower = (double)power/ 2;
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int count = 0;

        while (power >= distance){
            power -= distance;
            count++;

            if ((double)power == halfPower && exhaustionFactor != 0)
                power /= exhaustionFactor;
        }
        System.out.println(power);
        System.out.println(count);
    }
}

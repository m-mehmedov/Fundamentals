package DataTypesandVariables;

import java.util.Scanner;

public class E09_spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int total = 0;

        while (yield >= 100){
            days++;
            total += yield - 26;
            yield -= 10;
        }
        if (total >= 26)
            total -= 26;
        System.out.println(days);
        System.out.println(total);
    }
}

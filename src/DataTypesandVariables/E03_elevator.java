package DataTypesandVariables;

import java.util.Scanner;

public class E03_elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = people / capacity;

        if (people % capacity == 0)
            System.out.println(people / capacity);
        else
            System.out.println(people / capacity + 1);
    }
}


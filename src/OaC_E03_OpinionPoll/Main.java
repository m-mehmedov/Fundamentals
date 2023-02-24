package OaC_E03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            if (Integer.parseInt(inputLine[1]) > 30) {
                Person person = new Person(inputLine[0], inputLine[1]);
                people.add(person);
            }
        }
        for (Person person : people)
            System.out.println(person.getName() + " - " + person.getAge());
    }
}

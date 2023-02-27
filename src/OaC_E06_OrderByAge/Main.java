package OaC_E06_OrderByAge;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split("\\s+");
        List<Person> people = new ArrayList<>();

        while (!inputLine[0].equals("End")){
            Person person = new Person(
                    inputLine[0],
                    inputLine[1],
                    Integer.parseInt(inputLine[2])
            );
            people.add(person);
            inputLine = scanner.nextLine().split("\\s+");
        }
        people.sort(Comparator.comparing(Person::getAge));

        for (Person person : people){
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(), person.getAge());
        }
    }
}

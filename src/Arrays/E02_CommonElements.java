package Arrays;

import java.util.Scanner;

public class E02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] firsArray = firstLine.split(" ");
        String[] secondArray = secondLine.split( " ");
        for (String curSecondElement : secondArray) {
            for (String curFirstElement : firsArray) {
                if (curSecondElement.equals(curFirstElement))
                    System.out.printf("%s ",curSecondElement);
            }
        }
    }
}

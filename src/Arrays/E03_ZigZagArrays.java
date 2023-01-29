package Arrays;

import java.util.Scanner;

public class E03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[number];
        int[] secondArray = new int[number];
        int[] curArray = new int[2];

        for (int i = 0; i < number; i++) {

            String curInputStr = scanner.nextLine();
            Scanner curLine = new Scanner(curInputStr);
            curArray[0] = Integer.parseInt(curLine.next());
            curArray[1] = Integer.parseInt(curLine.next());

            if (i % 2 == 0) {
                firstArray[i] = curArray[0];
                secondArray[i] = curArray[1];
            }
            else  {
                firstArray[i] = curArray[1];
                secondArray[i] = curArray[0];
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.printf("%d ",firstArray[i]);
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.printf("%d ",secondArray[i]);
        }
    }
}

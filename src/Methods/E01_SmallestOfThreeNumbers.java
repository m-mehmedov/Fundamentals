package Methods;

import java.util.Scanner;

public class E01_SmallestOfThreeNumbers {
    static int smallestNum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++)
            checkIfSmallest(Integer.parseInt(scanner.nextLine()));
        System.out.println(smallestNum);
    }
    public static void checkIfSmallest(int num){
        if (num < smallestNum)
            smallestNum = num;
    }
}

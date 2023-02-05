package Methods;

import java.util.Scanner;

public class E06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMidChars(scanner.nextLine());
    }
    public static void printMidChars(String str){
        if (str.length() % 2 == 0)
            System.out.printf("%c%c%n", str.charAt(str.length()/2 - 1), str.charAt(str.length()/2));
        else
            System.out.println(str.charAt(str.length()/2));
    }
}

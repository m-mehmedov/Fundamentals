package Methods;

import java.util.Scanner;

public class E03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printChars(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0));
    }
    public static void printChars(char firstChar, char secondChar){
        if (firstChar < secondChar)
            for (int i = (int)firstChar + 1 ; i < (int)secondChar; i++)
                System.out.printf("%c ", (char)i);
        else
            for (int i = (int)secondChar + 1 ; i < (int)firstChar; i++)
                System.out.printf("%c ", (char)i);
    }
}

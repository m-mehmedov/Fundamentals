package BasicSyntaxMore;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        String reverseString = "";

        for (int pos = inputString.length() - 1; pos >= 0; pos--)
            reverseString += inputString.charAt(pos);

        System.out.println(reverseString);
    }
}

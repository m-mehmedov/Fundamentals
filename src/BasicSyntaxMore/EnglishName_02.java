package BasicSyntaxMore;

import java.util.Scanner;

public class EnglishName_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int lastDigit = number % 10;
        String digitString = "";

        switch (lastDigit){
            case 1: digitString = "one"; break;
            case 2: digitString = "two"; break;
            case 3: digitString = "three"; break;
            case 4: digitString = "four"; break;
            case 5: digitString = "five"; break;
            case 6: digitString = "six"; break;
            case 7: digitString = "seven"; break;
            case 8: digitString = "eight"; break;
            case 9: digitString = "nine"; break;
            case 0: digitString = "zero"; break;
            default: break;
        }
        System.out.println(digitString);
    }
}

package BasicSyntaxMore;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int greatestNum = 0;

        for (int i = 0; i <=2; i++){
            if (firstNum >= secondNum && firstNum >= thirdNum) {
                greatestNum = firstNum;
                firstNum = Integer.MIN_VALUE;
            }
            else if (secondNum >= firstNum && secondNum >= thirdNum){
                greatestNum = secondNum;
                secondNum = Integer.MIN_VALUE;
            }
            else {
                greatestNum = thirdNum;
                thirdNum = Integer.MIN_VALUE;
            }
            System.out.println(greatestNum);
        }
    }
}

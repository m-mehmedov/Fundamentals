package DataTypesandVariablesMore;

import java.util.Scanner;

public class E06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        boolean openBracket = false;
        boolean closeBracket = false;
        boolean isBalanced = true;
        String inputLine = scanner.nextLine();

        for (int i = 0; i < numberOfLines; i++) {
            if(openBracket){
                if (inputLine.equals("(")){
                    isBalanced = false;
                    break;
                } else if (inputLine.equals(")")) {
                    isBalanced = true;
                    openBracket = false;
                }
            }
            else {
                if (inputLine.equals("(")){
                    openBracket = true;
                    isBalanced = false;
                } else if (inputLine.equals(")")) {
                    isBalanced = false;
                    break;
                }
            }
            inputLine = scanner.nextLine();
        }
        if (isBalanced)
            System.out.println("BALANCED");
        else
            System.out.println("UNBALANCED");
    }
}
/*
8
asd(
)dwa
(dsa
)da
)sd
(sd
5
)dsa

 */
package DataTypesandVariablesMore;

import java.math.BigInteger;
import java.util.Scanner;

public class E01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String dataType = "";
        while (!inputLine.equals("END")){
            Scanner type = new Scanner(inputLine);
            if(type.hasNextBoolean()) {
                dataType = "boolean";
            } else if (type.hasNextInt()) {
                    dataType = "integer";
            } else if (type.hasNextDouble()) {
                dataType = "floating point";
            } else if (inputLine.length() == 1) {
                dataType = "character";
            } else
                dataType = "string";

            System.out.printf("%s is %s type", inputLine, dataType);
            System.out.println();
            inputLine = scanner.nextLine();
        }
    }
}

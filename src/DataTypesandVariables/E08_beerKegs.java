package DataTypesandVariables;

import java.util.Scanner;

public class E08_beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double biggestVolume = 0;
        String biggestModel = "";

        for (int i = 0; i < number; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double curVolume = (22/7) * Math.pow(radius, 2) * height;
            if (curVolume > biggestVolume){
                biggestVolume = curVolume;
                biggestModel = model;
            }
        }
        System.out.println(biggestModel);
    }
}

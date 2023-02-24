package OaC_E05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split("\\s+");
        List<Vehicle> vehicles = new ArrayList<>();

        while (!inputLine[0].equals("End")){
            Vehicle vehicle = new Vehicle(
                    inputLine[0],
                    inputLine[1],
                    inputLine[2],
                    Integer.parseInt(inputLine[3])
            );
            vehicles.add(vehicle);
            inputLine = scanner.nextLine().split("\\s+");
        }
        String brand = scanner.nextLine();
        while (!brand.equals("Close the Catalogue")){
            for (Vehicle vehicle : vehicles) {
                if (brand.equals(vehicle.getModel())) {
                    if (vehicle.getType().equals("car"))
                        System.out.println("Type: Car");
                    else
                        System.out.println("Type: Truck");
                    System.out.println("Model: " + vehicle.getModel());
                    System.out.println("Color: " + vehicle.getColor());
                    System.out.println("Horsepower: " + vehicle.getPower());
                }
            }
            brand = scanner.nextLine();
        }
        int sumCarPower = 0;
        int sumTruckPower = 0;
        int carCount = 0;
        int truckCount = 0;

        for (Vehicle vehicle : vehicles){
            if (vehicle.getType().equals("car")) {
                sumCarPower += vehicle.getPower();
                carCount++;
            }
            else {
                sumTruckPower += vehicle.getPower();
                truckCount++;
            }
        }
        double avgCarPower = 0;
        double avgTruckPower = 0;
        if (carCount > 0)
            avgCarPower = (double)sumCarPower / carCount;
        if (truckCount > 0)
            avgTruckPower = (double)sumTruckPower / truckCount;

        System.out.printf("Cars have average horsepower of: %.2f.%n",avgCarPower);
        System.out.printf("Trucks have average horsepower of: %.2f.",avgTruckPower);
    }
}

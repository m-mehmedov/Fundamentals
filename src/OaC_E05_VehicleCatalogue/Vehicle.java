package OaC_E05_VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int power;

    public Vehicle(String type, String model, String color, int power){
        this.type = type;
        this.model = model;
        this.color = color;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }
}

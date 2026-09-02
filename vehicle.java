package car;

import java.util.ArrayList;

public abstract class vehicle {

    public String brand;
    public String model;
    public String color;

    public vehicle(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Color: " + color;
    }
}

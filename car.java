package car;

public class car extends vehicle{

    private int doors;

    public car(String brand, String model, String color, int doors) {
        super(brand, model, color);
        this.doors = doors;
    }

    @Override
    public String toString(){
        return "Car | " + super.toString() + "Doors " + doors;
    }
}

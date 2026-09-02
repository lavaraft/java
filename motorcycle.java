package car;

public class motorcycle extends vehicle {

    private String displacement;

    public motorcycle(String brand, String model, String color, String displacement) {
        super(brand, model, color);
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Motorcycle | " + super.toString() + "Dsiplacement " + displacement;
    }
}

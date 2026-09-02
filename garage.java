package car;

import java.util.ArrayList;

public class garage {
    private ArrayList<vehicle> vehicles = new ArrayList<>();

    public garage() {
    }

    public void showGarages() {
        if  (vehicles.isEmpty()) {
            System.out.println("Garage empty");
            return;
        }
        for (vehicle v : vehicles) {
            System.out.println(v);
        }

    }

    public void addVehicle(vehicle v) {
        vehicles.add(v);
    }
}

package lesson28.hw28.vehicle;

public class VehicleAdd {
    public static void main(String[] args) {
        Vehicle vehicles[] = {new Car(), new Bicycle(), new Motorcycle()};

        for (int i = 0; i < vehicles.length; i++){
            vehicles[i].startEngine();
        }

    }
}

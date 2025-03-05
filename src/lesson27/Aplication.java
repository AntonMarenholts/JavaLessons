package lesson27;

public class Aplication {
    public static void main(String[] args) {

        BusDriver busDriver = new BusDriver("John", "LN-00002");

        Autobus bus = new Autobus(busDriver, 15);
        System.out.println(bus.toString());

        bus.showListPassengers();

        System.out.println("\n==================\n");

        Passenger John = new Passenger("John");
        Passenger Mario = new Passenger("Mario");
        Passenger Jane = new Passenger("Jane");

        System.out.println(John.toString());
        System.out.println(Mario.toString());

        bus.takePassenger(John);
        bus.takePassenger(John);

        bus.takePassenger(Mario);

        bus.takePassenger(Jane);
        bus.takePassenger(Jane);

        System.out.println("Кол-во пассажиров: " + bus.getCountPassenger());

        bus.showListPassengers();




    }

}

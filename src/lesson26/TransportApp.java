package lesson26;

public class TransportApp {
    public static void main(String[] args) {

        Bus bus = new Bus("bus-X1 ", 2020, 10);

        String str = bus.toString();
        System.out.println(str);

        bus.start();
        bus.stop();

        System.out.println("model: " + bus.getModel());
        System.out.println("year: " + bus.getYear());
        System.out.println("capacity: " + bus.getCapacity());

        System.out.println("\n========================\n");


        Train train = new Train("BMW", 2020, 40,7);
        System.out.println(train.toString());
        train.start();
        train.stop();

        System.out.println("capacity: " + train.getCapacity());
        train.setCountWagons(10);
        System.out.println("capacity: " + train.getCapacity());;

        System.out.println("\n=========================Bus-X22================\n");


    }
}

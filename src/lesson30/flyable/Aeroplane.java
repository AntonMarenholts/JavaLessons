package lesson30.flyable;

public class Aeroplane extends Transport implements Flyable  {

    public Aeroplane(int capacity) {
        super(capacity);
    }

    @Override
    public void fly() {
        System.out.println("Aeroplane fly");
    }

    @Override
    boolean takePassenger() {
        if (amountPassenger < capacity){
            amountPassenger++;
            return true;
        }
        return false;
    }
}

package lesson30.flyable;

public abstract class Transport {
    int capacity;
    int amountPassenger;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    abstract boolean takePassenger();
}

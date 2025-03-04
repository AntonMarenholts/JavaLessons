package lesson26;


// Train is-a Bus - НЕ ВЕРНО
public class Train extends Vehicle {

    private int capacity;
    private int countPassengers;
    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int wagonCapacity, int countWagons) {
        super(model, year);
        this.wagonCapacity = wagonCapacity;
        this.countWagons = countWagons;
        // определить вместимость - просчитать capacity
        calculateCapasity();

    }

    private void calculateCapasity(){
        this.capacity = countWagons * wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapasity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }
}

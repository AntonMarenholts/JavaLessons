package lesson37.enums;

public class TrafficLight {
    private String serialNumber;
    private String Location;

    private Colors light;

    public TrafficLight(String serialNumber, String location, Colors light) {
        this.serialNumber = serialNumber;
        this.Location = location;
        this.light = light;
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "serialNumber='" + serialNumber + '\'' +
                ", Location='" + Location + '\'' +
                ", light='" + light + '\'' +
                '}';
    }
}

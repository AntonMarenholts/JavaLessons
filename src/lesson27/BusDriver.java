package lesson27;

public class BusDriver {

    private static int idCounter = 101;
    private final int id;

    private String name;
    private String License;

    public BusDriver(String name, String license) {
        this.id = idCounter++;
        this.name = name;
        License = license;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder("BusDriver: {");
        //цепочка вызовов = Method chaining
        sb.append("id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append("}");
        return sb.toString();
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        BusDriver.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return License;
    }

    public void setLicense(String license) {
        License = license;
    }
}

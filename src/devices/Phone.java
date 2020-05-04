package devices;

public class Phone {
    String producer;
    String model;
    Double screenSize;

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
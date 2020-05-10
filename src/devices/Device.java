package devices;

public abstract class Device {
    public final String producer;
    public final String model;
    String yearOfProduction;

    public Device(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device: " + getClass().getName() +" Model: " + model + " Producer: " + producer +" Year of production: " + yearOfProduction;
    }
}

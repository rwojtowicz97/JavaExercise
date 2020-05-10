package devices;

public class Phone extends Device {
    Double screenSize;

    public Phone(String model, String producer, double screenSize) {
        super(producer, model);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("turn on Phone");
    }

}
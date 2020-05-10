package devices;

public class Car extends Device {
    public double value;
    String color;
    Integer seats;


    public Car(String model, String producer, String yearOfProduction, double value) {
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car simpson = (Car) o;
        return model == simpson.model &&
                producer.equals(simpson.producer);
    }

    @Override
    public void turnOn() {
        System.out.println("turn on Car");
    }
}

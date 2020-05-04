package devices;

public class Car {
    public double value;
    String color;
    Integer seats;
    final String model;
    final String producent;


    public Car(String model, String producent, double value) {
        this.model = model;
        this.producent = producent;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car simpson = (Car) o;
        return model == simpson.model &&
                producent.equals(simpson.producent);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producent='" + producent + '\'' +
                ", value=" + value +
                '}';
    }
}

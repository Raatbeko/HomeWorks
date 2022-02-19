import java.util.Objects;

public class Car {
    private String modelOfCar;

    public Car() {
    }

    public Car(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelOfCar='" + modelOfCar + '\'' +
                '}';
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(modelOfCar, car.modelOfCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelOfCar);
    }
}

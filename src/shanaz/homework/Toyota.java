package shanaz.homework;

public class Toyota {
    Car thisCar = null;

    public Toyota(String model) {
        thisCar = new Car("Toyota", model, "coupe");
    }

    public String getName() {
        return thisCar.getName();
    }
}

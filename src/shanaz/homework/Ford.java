package shanaz.homework;

public class Ford {
    Car thisCar = null;

    public Ford(String model) {
        thisCar = new Car("Ford", model, "sports car");
    }

    public String getName() {
        return thisCar.getName();
    }
}

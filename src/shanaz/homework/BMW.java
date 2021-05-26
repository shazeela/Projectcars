package shanaz.homework;

public class BMW {
    Car thisCar = null;

    public BMW(String model) {
        thisCar = new Car("BMW", model, "station wagon");
    }

    public String getName() {
        return thisCar.getName();
    }

}

package shanaz.homework;

public class Honda {
    Car thisCar = null;

    public Honda(String model) {
        thisCar = new Car("Honda", model, "sedan");
    }

    public String getName() {
        return thisCar.getName();
    }
}

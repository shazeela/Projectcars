package shanaz.homework;

public class Lincoln {
    Car thisCar = null;

    public Lincoln(String model) {
        thisCar = new Car("Lincoln", model, "sedan");
    }

    public String getName() {
        return thisCar.getName();
    }
}

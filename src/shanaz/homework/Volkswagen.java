package shanaz.homework;

public class Volkswagen {
    Car thisCar = null;

    public Volkswagen(String model) {
        thisCar = new Car("Volkswagen", model, "sedan");
    }

    public String getName() {
        return thisCar.getName();
    }
}

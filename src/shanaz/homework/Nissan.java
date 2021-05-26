package shanaz.homework;

public class Nissan {
    Car thisCar = null;

    public Nissan(String model) {
        thisCar = new Car("Nissan", model, "sedan");
    }

    public String getName() {
        return thisCar.getName();
    }

}

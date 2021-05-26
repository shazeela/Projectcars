package shanaz.homework;

public class Car {
    private String name;
    private String model;
    private String type;

    public Car(String carName, String carModel, String carType) {
        name = carName;
        model = carModel;
        type = carType;
    }

    // Get the name of the car
    public String getName() {
        return name;
    }

    // Set the name of the Car
    public void setName(String newName) {
        name = newName;
    }

    // // Get the type of the Car
    public String getType() {
        return type;
    }

    // // Set the type of the Car
    public void setType(String newType) {
        type = newType;
    }

    // // Get the model of the Car
    public String getModel() {
        return model;
    }

    // // Set the model of the Car
    public void setModel(String newModel) {
        model = newModel;
    }

}


package shanaz.homework;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the Car Kingdom!");

        Nissan rogue = new Nissan("Sentra");
        BMW m3 = new BMW("M3");
        Ford mustang = new Ford("Mustang");
        Lincoln avaitor = new Lincoln("Avaitor");
        Volkswagen atlas = new Volkswagen("Atla" + "" + "s");
        Honda pilot = new Honda("pilot");
        Toyota corolla = new Toyota("Corolla");

        System.out.printf("The Nissan model is %s \n", rogue.thisCar.getModel());
        System.out.printf("The BMW model is %s \n", m3.thisCar.getModel());
        System.out.printf("The Ford model is %s \n", mustang.thisCar.getModel());
        System.out.printf("The Lincoln model is %s \n", avaitor.thisCar.getModel());
        System.out.printf("The Volkswagen model is %s \n", atlas.thisCar.getModel());
        System.out.printf("The Honda Pilot model is %s \n", pilot.thisCar.getModel());
        System.out.printf("The Toyota Corolla model is %s \n", corolla.thisCar.getModel());

    }
}

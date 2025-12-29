//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Drivers
        Driver driver1 = new Driver("Charlie Kirk", "WACK2025");
        Driver driver2 = new Driver("George Floyd", "ICB1973");
        Driver driver3 = new Driver("Jeffrey Epstein", "BSI6767");

        //Vehicles

        Vehicle car = new Car("Dodge", 2023, driver1, 2, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2018, driver2, false);
        Vehicle truck = new Truck("Volvo", 2015, driver3, 12, 4);

        Vehicle[] vehicles = {car,motorcycle,truck};

        for (Vehicle v : vehicles){
            v.startEngine();
            v.displayInfo();
            v.displayDriver();
            v.stopEngine();
        }
    }
}
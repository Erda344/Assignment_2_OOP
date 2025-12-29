public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    public Motorcycle(String brand, int year, Driver driver, boolean hasSideCar){
        super(brand, year, driver);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }
}


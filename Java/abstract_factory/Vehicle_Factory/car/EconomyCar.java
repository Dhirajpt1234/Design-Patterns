package Java.abstract_factory.Vehicle_Factory.car;

public class EconomyCar extends Car {
    
    @Override
    public void drive() {
        System.out.println("Driving an economy car with fuel efficiency");
    }
    
    @Override
    public String getBrand() {
        return "Toyota";
    }
}

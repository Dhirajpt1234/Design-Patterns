package Java.abstract_factory.Vehicle_Factory.motorcycle;

public class LuxuryMotorcycle extends Motorcycle {
    
    @Override
    public void ride() {
        System.out.println("Riding a luxury motorcycle with high performance");
    }
    
    @Override
    public String getBrand() {
        return "Harley-Davidson";
    }
}

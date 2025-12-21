package Java.abstract_factory.Vehicle_Factory.motorcycle;

public class EconomyMotorcycle extends Motorcycle {
    
    @Override
    public void ride() {
        System.out.println("Riding an economy motorcycle with good mileage");
    }
    
    @Override
    public String getBrand() {
        return "Honda";
    }
}

package Java.abstract_factory.Vehicle_Factory.car;

public class LuxuryCar extends Car {
    
    @Override
    public void drive() {
        System.out.println("Driving a luxury car with premium features");
    }
    
    @Override
    public String getBrand() {
        return "Mercedes-Benz";
    }
}

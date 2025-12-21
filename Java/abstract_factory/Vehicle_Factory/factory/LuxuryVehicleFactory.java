package Java.abstract_factory.Vehicle_Factory.factory;

import Java.abstract_factory.Vehicle_Factory.car.Car;
import Java.abstract_factory.Vehicle_Factory.car.LuxuryCar;
import Java.abstract_factory.Vehicle_Factory.motorcycle.Motorcycle;
import Java.abstract_factory.Vehicle_Factory.motorcycle.LuxuryMotorcycle;

public class LuxuryVehicleFactory extends VehicleFactory {
    
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }
    
    @Override
    public Motorcycle createMotorcycle() {
        return new LuxuryMotorcycle();
    }
}

package Java.abstract_factory.Vehicle_Factory.factory;

import Java.abstract_factory.Vehicle_Factory.car.Car;
import Java.abstract_factory.Vehicle_Factory.car.EconomyCar;
import Java.abstract_factory.Vehicle_Factory.motorcycle.Motorcycle;
import Java.abstract_factory.Vehicle_Factory.motorcycle.EconomyMotorcycle;

public class EconomyVehicleFactory extends VehicleFactory {
    
    @Override
    public Car createCar() {
        return new EconomyCar();
    }
    
    @Override
    public Motorcycle createMotorcycle() {
        return new EconomyMotorcycle();
    }
}

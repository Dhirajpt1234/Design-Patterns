package Java.abstract_factory.Vehicle_Factory.factory;

import Java.abstract_factory.Vehicle_Factory.car.Car;
import Java.abstract_factory.Vehicle_Factory.motorcycle.Motorcycle;

public abstract class VehicleFactory {
    
    public abstract Car createCar();
    
    public abstract Motorcycle createMotorcycle();
}

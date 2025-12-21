package Java.abstract_factory.Vehicle_Factory.client;

import Java.abstract_factory.Vehicle_Factory.factory.VehicleFactory;
import Java.abstract_factory.Vehicle_Factory.factory.LuxuryVehicleFactory;
import Java.abstract_factory.Vehicle_Factory.factory.EconomyVehicleFactory;
import Java.abstract_factory.Vehicle_Factory.car.Car;
import Java.abstract_factory.Vehicle_Factory.motorcycle.Motorcycle;

public class VehicleClient {
    
    private Car car;
    private Motorcycle motorcycle;
    
    public VehicleClient(VehicleFactory factory) {
        this.car = factory.createCar();
        this.motorcycle = factory.createMotorcycle();
    }
    
    public void testVehicles() {
        System.out.println("Testing " + car.getBrand() + " car:");
        car.drive();
        System.out.println();
        
        System.out.println("Testing " + motorcycle.getBrand() + " motorcycle:");
        motorcycle.ride();
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("🚗 Abstract Factory Pattern - Vehicle Factory Example\n");
        
        System.out.println("💰 Testing Economy Vehicles:");
        VehicleFactory economyFactory = new EconomyVehicleFactory();
        VehicleClient economyClient = new VehicleClient(economyFactory);
        economyClient.testVehicles();
        
        System.out.println("💎 Testing Luxury Vehicles:");
        VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
        VehicleClient luxuryClient = new VehicleClient(luxuryFactory);
        luxuryClient.testVehicles();
        
        System.out.println("✅ Abstract Factory pattern demonstration completed!");
    }
}

package Java.factory_pattern.Restaurant;

public class Client {

    //Ordering the veg burger
    Restaurant vegResto = new VegResto();
    Burger vegBurger = vegResto.createBurger();

    // Order chicken burger
    Restaurant chickenResto = new ChickenResto();
    Burger chickenBurger = chickenResto.createBurger();
    
}

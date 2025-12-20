package Java.factory_pattern.Restaurant;

public class VegResto extends Restaurant {

    @Override
    public Burger createBurger() {
        return new VegBurger();
    }
    
}

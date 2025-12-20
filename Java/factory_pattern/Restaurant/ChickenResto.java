package Java.factory_pattern.Restaurant;

public class ChickenResto  extends Restaurant{

    @Override
    public Burger createBurger() {
        return new ChickenBurger();
    }
    
}

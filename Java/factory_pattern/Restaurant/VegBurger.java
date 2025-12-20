package Java.factory_pattern.Restaurant;

public class VegBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing the veg burger");
    }
}

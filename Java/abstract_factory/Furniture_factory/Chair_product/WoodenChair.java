package Java.abstract_factory.Furniture_factory.Chair_product;

public class WoodenChair implements Chair {

    @Override
    public void prepare() {
        System.out.println("Preparing the woodern chair");
    }

    @Override
    public void getBrand() {
        System.out.println("its a wooden chair");
    }
    
}

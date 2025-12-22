package Java.abstract_factory.Furniture_factory.Chair_product;

public class PlasticChair implements Chair {

    @Override
    public void prepare() {
        System.out.println("Preparing the Plastic Chair");
    }

    @Override
    public void getBrand() {
        System.out.println("its a Plastic chair");
    }
    
}

package Java.abstract_factory.Furniture_factory.Table_product;

public class WoodenTable implements Table {

    @Override
    public void prepare() {
        System.out.println("Preparing the Wooden Table");
    }

    @Override
    public void getBrand() {
        System.out.println("its a wooden Table");
    }
    
}

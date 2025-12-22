package Java.abstract_factory.Furniture_factory.Table_product;

public class PlasticTable implements Table {

    @Override
    public void prepare() {
        System.out.println("Preparing the Plastic Table");
    }

    @Override
    public void getBrand() {
        System.out.println("its a Plastic Table");
    }
    
}

package Java.observer_pattern.StoreSale;

/**
 * Shopper class - Concrete Observer
 * Represents an individual shopper who wants to be notified about sales
 */
public class Shopper implements Observer {
    private String name;
    
    public Shopper(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void notify(String storeName, int discount) {
        System.out.println(name + ", there is a sale at " + storeName + "! " + 
                          discount + "% off everything!");
    }
}


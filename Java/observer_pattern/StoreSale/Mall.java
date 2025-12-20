package Java.observer_pattern.StoreSale;

import java.util.ArrayList;
import java.util.List;

/**
 * Mall class - Concrete Observer
 * Represents a mall that tracks all sales from different stores
 */
public class Mall implements Observer {
    private List<SaleRecord> sales;
    
    public Mall() {
        this.sales = new ArrayList<>();
    }
    
    @Override
    public void notify(String storeName, int discount) {
        sales.add(new SaleRecord(storeName, discount));
    }
    
    /**
     * Get all recorded sales
     * @return List of sale records
     */
    public List<SaleRecord> getSales() {
        return new ArrayList<>(sales); // Return a copy to maintain encapsulation
    }
    
    /**
     * Print all recorded sales
     */
    public void printSales() {
        System.out.println("\n=== Mall Sales Records ===");
        if (sales.isEmpty()) {
            System.out.println("No sales recorded yet.");
        } else {
            for (SaleRecord sale : sales) {
                System.out.println("- " + sale.getStoreName() + ": " + sale.getDiscount() + "% off");
            }
        }
        System.out.println("Total sales events: " + sales.size());
    }
    
    /**
     * Inner class to represent a sale record
     */
    public static class SaleRecord {
        private String storeName;
        private int discount;
        
        public SaleRecord(String storeName, int discount) {
            this.storeName = storeName;
            this.discount = discount;
        }
        
        public String getStoreName() {
            return storeName;
        }
        
        public int getDiscount() {
            return discount;
        }
    }
}


package Java.observer_pattern.StoreSale;

/**
 * Observer interface
 * Defines the contract for objects that should be notified of changes
 */
public interface Observer {
    /**
     * Called by the subject when a state change occurs
     * @param storeName The name of the store having a sale
     * @param discount The discount percentage
     */
    void notify(String storeName, int discount);
}


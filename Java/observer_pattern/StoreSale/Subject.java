package Java.observer_pattern.StoreSale;

/**
 * Subject interface
 * Defines the contract for objects that can be observed
 */
public interface Subject {
    /**
     * Subscribe an observer to receive notifications
     * @param observer The observer to subscribe
     */
    void subscribe(Observer observer);
    
    /**
     * Unsubscribe an observer from receiving notifications
     * @param observer The observer to unsubscribe
     */
    void unsubscribe(Observer observer);
    
    /**
     * Notify all subscribed observers of a state change
     * @param storeName The name of the store having a sale
     * @param discount The discount percentage
     */
    void notifyObservers(String storeName, int discount);
}


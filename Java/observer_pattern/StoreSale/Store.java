package Java.observer_pattern.StoreSale;

import java.util.ArrayList;
import java.util.List;

/**
 * Store class - Concrete Subject
 * Represents a store that can notify observers about sales
 */
public class Store implements Subject {
    private String name;
    private List<Observer> observers;
    
    public Store(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void subscribe(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println(observer.getClass().getSimpleName() + " subscribed to " + name);
        }
    }
    
    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println(observer.getClass().getSimpleName() + " unsubscribed from " + name);
    }
    
    @Override
    public void notifyObservers(String storeName, int discount) {
        for (Observer observer : observers) {
            observer.notify(storeName, discount);
        }
    }
    
    /**
     * Announce a sale and notify all observers
     * @param discount The discount percentage
     */
    public void sale(int discount) {
        System.out.println("\n" + name + " announces a " + discount + "% off sale!");
        notifyObservers(name, discount);
    }
}


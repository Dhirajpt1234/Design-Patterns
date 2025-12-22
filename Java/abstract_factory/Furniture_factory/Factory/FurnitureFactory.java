package Java.abstract_factory.Furniture_factory.Factory;

import Java.abstract_factory.Furniture_factory.Chair_product.Chair;
import Java.abstract_factory.Furniture_factory.Table_product.Table;

public interface FurnitureFactory {

    public Chair prepareChair(); // factory method for chair(product A)

    public Table prepareTable(); // factory method for Table(product B)
}

package Java.abstract_factory.Furniture_factory.Factory;

import Java.abstract_factory.Furniture_factory.Chair_product.Chair;
import Java.abstract_factory.Furniture_factory.Chair_product.WoodenChair;
import Java.abstract_factory.Furniture_factory.Table_product.Table;
import Java.abstract_factory.Furniture_factory.Table_product.WoodenTable;

public class WoodernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair prepareChair() {
        return new WoodenChair();
    }

    @Override
    public Table prepareTable() {
        return new WoodenTable();
    }

}

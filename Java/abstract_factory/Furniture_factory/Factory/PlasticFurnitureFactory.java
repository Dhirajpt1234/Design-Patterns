package Java.abstract_factory.Furniture_factory.Factory;

import Java.abstract_factory.Furniture_factory.Chair_product.Chair;
import Java.abstract_factory.Furniture_factory.Chair_product.PlasticChair;
import Java.abstract_factory.Furniture_factory.Table_product.PlasticTable;
import Java.abstract_factory.Furniture_factory.Table_product.Table;

public class PlasticFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair prepareChair() {
        return new PlasticChair();
    }

    @Override
    public Table prepareTable() {
        return new PlasticTable();
    }

}

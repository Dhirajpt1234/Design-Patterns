package Java.abstract_factory.Furniture_factory.client;

import Java.abstract_factory.Furniture_factory.Chair_product.Chair;
import Java.abstract_factory.Furniture_factory.Factory.FurnitureFactory;
import Java.abstract_factory.Furniture_factory.Factory.PlasticFurnitureFactory;
import Java.abstract_factory.Furniture_factory.Factory.WoodernFurnitureFactory;
import Java.abstract_factory.Furniture_factory.Table_product.Table;

public class Client {
    private Chair chair;
    private Table table;

    public Client(FurnitureFactory factory) {
        this.chair = factory.prepareChair();
        this.table = factory.prepareTable();
    }

    public void testFurniture(){
        System.out.println("Testing the Chair");
        this.chair.getBrand();
        System.out.println("");

        System.out.println("Testing the Table");
        this.table.getBrand();
        System.out.println("");
    }

    public static void main(String args[]) {
        System.out.println("Creating the wooden furniture for woodernMarchant");
        FurnitureFactory woodernFurnitureFactory = new WoodernFurnitureFactory();
        Client woodenClient = new Client(woodernFurnitureFactory);
        woodenClient.testFurniture();


        System.out.println("Creating the Plastic furniture for PlasticMarchant");
        FurnitureFactory plasticFurnitureFactory = new PlasticFurnitureFactory();
        Client plasticClient = new Client(plasticFurnitureFactory);
        plasticClient.testFurniture();


    }

}

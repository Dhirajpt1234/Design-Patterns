package Java.adaptor_pattern.Resto_app;

public class client {
    public static void main(String args[]) {
        XmlData xmlData = new XmlData();

        // old UI
        IRestoApp restoApp = new RestoApp();
        restoApp.displayMenus(xmlData);
        restoApp.displayRecommendations(xmlData);

        // new UI
        FancyUIServiceAdaptor fancyUIServiceAdaptor = new FancyUIServiceAdaptor();
        fancyUIServiceAdaptor.displayMenus(xmlData);
        fancyUIServiceAdaptor.displayRecommendations(xmlData);

    }

}

package Java.adaptor_pattern.Resto_app;

public class RestoApp implements IRestoApp {

    @Override
    public void displayMenus(XmlData xmlData) {
        System.out.println("Dispalying the menus in app");
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        System.out.println("Dispalying the Recommendations in app");
    }

}

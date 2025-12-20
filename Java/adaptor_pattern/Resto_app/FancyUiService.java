package Java.adaptor_pattern.Resto_app;

public class FancyUiService implements IFancyUiService{

    @Override
    public void displayMenus(JsonData jsonData) {
        System.out.println("Dispalying the fancy menus in app");
    }

    @Override
    public void displayRecommendations(JsonData jsonData) {
        System.out.println("Dispalying the fancy Recommendations in app");
    }
    
}

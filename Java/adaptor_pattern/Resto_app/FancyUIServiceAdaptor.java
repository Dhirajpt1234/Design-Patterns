package Java.adaptor_pattern.Resto_app;

public class FancyUIServiceAdaptor implements IRestoApp{  // implement our interface 
    
    private final IFancyUiService fancyUiService = new FancyUiService(); // create instance of their interface

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData JsonConvertedData = convertXMLtoJSON(xmlData);
        fancyUiService.displayMenus(JsonConvertedData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData JsonConvertedData = convertXMLtoJSON(xmlData);
        fancyUiService.displayRecommendations(JsonConvertedData);
    }

    public JsonData convertXMLtoJSON(XmlData xmlData){
        return new JsonData();
    }
    
}

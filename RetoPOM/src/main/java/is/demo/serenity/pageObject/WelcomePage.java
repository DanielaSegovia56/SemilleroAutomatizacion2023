package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WelcomePage extends PageObject {
    private final By labelDashboard = By.xpath("//section[@class='content-header']/h1");

    private final By btnMoreInformation = By.xpath("//a[@href='/Northwind/Order?shippingState=0']");
    public By getLabelDashboard() {
        return labelDashboard;
    }

    public By getBtnMoreInformation() {
        return btnMoreInformation;
    }
}

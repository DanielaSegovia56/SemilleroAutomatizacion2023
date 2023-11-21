package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectOrderPage extends PageObject {

    private final By btnMoreInformation = By.xpath("//a[@href='/Northwind/Order?shippingState=0']");

    private final By order = By.xpath("//a[@data-item-type='Demo.Northwind.Order']");


    public By getBtnMoreInformation() {
        return btnMoreInformation;
    }

    public By getOrder() {
        return order;
    }
}

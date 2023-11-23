package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ListOrderPage extends PageObject {

    private final By lsOrders = By.xpath("//a[@data-item-type='Demo.Northwind.Order']");

    public By getLsOrders() {
        return lsOrders;
    }

}

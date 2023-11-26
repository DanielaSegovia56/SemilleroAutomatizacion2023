package is.demo.serenity.steps;

import is.demo.serenity.pageObject.ListOrderPage;
import is.demo.serenity.utils.RandomSelection;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ListOrderSteps {

    @Page
    ListOrderPage listOrderPage;

    @Step
    public void listOrders(){
        List<WebElement> orders = listOrderPage.getDriver().findElements(listOrderPage.getLsOrders());
        WebElement order = RandomSelection.selectOrders(orders);
        order.click();
    }


}

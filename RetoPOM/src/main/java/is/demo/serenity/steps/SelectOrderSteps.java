package is.demo.serenity.steps;

import is.demo.serenity.pageObject.SelectOrderPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


public class SelectOrderSteps {

    @Page
    SelectOrderPage selectOrderPage;

    @Step
    public void clickOnMoreInformation(){
        selectOrderPage.getDriver().findElement(selectOrderPage.getBtnMoreInformation()).click();
    }

    @Step
    public void selectOrder(){

        //changeNamePage.getDriver().findElement(changeNamePage.getLinkOrder()).click();
    }


}

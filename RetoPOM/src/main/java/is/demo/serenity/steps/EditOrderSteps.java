package is.demo.serenity.steps;

import is.demo.serenity.pageObject.EditOrderPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class EditOrderSteps {

    @Page
    EditOrderPage editOrderPage;

    @Step
    public void clickOnEmployee(){
        editOrderPage.getDriver().findElement(editOrderPage.getListEmployee()).submit();
    }

    @Step
    public void selectList(){

    }
}

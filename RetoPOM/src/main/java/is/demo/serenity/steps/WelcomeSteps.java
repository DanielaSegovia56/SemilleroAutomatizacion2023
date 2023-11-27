package is.demo.serenity.steps;

import is.demo.serenity.pageObject.WelcomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class WelcomeSteps {
    @Page
    WelcomePage welcomePage;

    @Step
    public void clickOnMoreInformation(){
        welcomePage.getDriver().findElement(welcomePage.getBtnMoreInformation()).click();
    }

    @Step
    public void validateLogin() {
        Assert.assertEquals("Tablero", welcomePage.getDriver().
                findElement(welcomePage.getLabelDashboard()).getText());
    }

}


package is.demo.serenity.steps;

import is.demo.serenity.pageObject.LoginPage;
import is.demo.serenity.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.ArrayList;
import java.util.Map;

public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void openBrowser(){
        loginPage.openUrl("https://demo.serenity.is");
    }

    @Step
    public void cleanFields(){
        loginPage.getDriver().findElement(loginPage.getTxtUser()).clear();
        loginPage.getDriver().findElement(loginPage.getTxtPass()).clear();
    }
    @Step
    public void sendCredentials(){
        ArrayList<Map<String, String>> credential = Data.extractTo();
        loginPage.getDriver().findElement(loginPage.getTxtUser()).
                sendKeys(credential.get(0).get("User"));
        loginPage.getDriver().findElement(loginPage.getTxtPass()).
                sendKeys(credential.get(0).get("Password"));
    }

    @Step
    public void clickOnLogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin()).click();
    }
}

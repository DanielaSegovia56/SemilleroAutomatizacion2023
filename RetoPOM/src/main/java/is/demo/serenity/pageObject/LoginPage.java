package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private final By txtUser = By.id("LoginPanel0_Username");
    private final By txtPass = By.id("LoginPanel0_Password");
    private final By btnLogin = By.id("LoginPanel0_LoginButton");

    public By getTxtUser() {
        return txtUser;
    }

    public By getTxtPass() {
        return txtPass;
    }

    public By getBtnLogin() {
        return btnLogin;
    }
}

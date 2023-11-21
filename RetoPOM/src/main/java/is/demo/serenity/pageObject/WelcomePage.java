package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class WelcomePage extends PageObject {

    private final By labelDashboard = By.xpath("//section[@class='content-header']/h1");

    public By getLabelDashboard() {
        return labelDashboard;
    }
}

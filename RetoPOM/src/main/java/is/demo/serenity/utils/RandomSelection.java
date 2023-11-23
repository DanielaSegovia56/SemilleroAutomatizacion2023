package is.demo.serenity.utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomSelection {

    public static WebElement selectOrders(List<WebElement> orders){
        Random random = new Random();
        int index = random.nextInt(orders.size());
        return orders.get(index);
    }
}

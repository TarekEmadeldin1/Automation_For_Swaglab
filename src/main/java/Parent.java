import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Parent {
    protected WebDriver driver;
    public Parent(WebDriver driver){
        this.driver=driver;
    }

    public void Sending(WebElement Element, String text){
        Element.sendKeys(text);
    }
    public void Clicking(WebElement Element){
        Element.click();
    }
}

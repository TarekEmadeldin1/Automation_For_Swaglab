import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testbase {
    protected WebDriver driver;

    @BeforeTest
    public void OpenBowser(){
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void Quit(){
        driver.quit();
    }

}

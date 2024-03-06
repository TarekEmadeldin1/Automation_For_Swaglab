import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Parent{
    public LoginPage(WebDriver driver){
        super(driver);
    }

    //Attributes
    private WebElement UsernameElement ;
    By UsernameAddress = By.id("user-name");
    private WebElement PasswordElemnt;
    By PasswordAddress = By.id("password");
    private WebElement LoginElement;
    By LoginAddress = By.id("login-button");
    private WebElement MenuElement;
    By MenuAddress= By.id("react-burger-menu-btn");
    private WebElement LogoutElement ;
    By LogoutAddress = By.id("logout_sidebar_link");

    //Operations
    public void Username(String text){
        UsernameElement = driver.findElement(UsernameAddress);
        Sending(UsernameElement,text);
    }
    public void Password(String text){
        PasswordElemnt = driver.findElement(PasswordAddress);
        Sending(PasswordElemnt,text);
    }
    public void LoginButton(){
        LoginElement = driver.findElement(LoginAddress);
        Clicking(LoginElement);
    }
    public void Menu(){
        MenuElement = driver.findElement(MenuAddress);
        Clicking(MenuElement);
    }
    public void Logout(){
        LogoutElement = driver.findElement(LogoutAddress);
        Clicking(LogoutElement);
    }
    public void ClearUsername(){
        UsernameElement= driver.findElement(UsernameAddress);
        UsernameElement.sendKeys(Keys.CONTROL + "a");
        UsernameElement.sendKeys(Keys.DELETE);

    }
    public void ClearPassword(){
        PasswordElemnt = driver.findElement(PasswordAddress);
        PasswordElemnt.sendKeys(Keys.CONTROL + "a");
        PasswordElemnt.sendKeys(Keys.DELETE);
    }
}

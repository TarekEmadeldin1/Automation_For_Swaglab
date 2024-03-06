import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest extends Testbase {
    private LoginPage loginPage;

    @DataProvider(name = "Valid Credentials")
    public static Object[][] Data1() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"visual_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
                {"error_user", "secret_sauce"}
        };
    }

    //ALl Valid Login for SwagLabs using Valid Usernames and Passwords
    @Test(dataProvider = "Valid Credentials", priority = 1)
    public void ValidLogin(String user, String Pass) {
        loginPage = new LoginPage(driver);
        loginPage.Username(user);
        loginPage.Password(Pass);
        loginPage.LoginButton();
        loginPage.Menu();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.Logout();
    }

    //Invalid Subscription With InValid UserName and Valid Password
    @Test(priority = 2)
    public void InValidLogin1() {
        loginPage = new LoginPage(driver);
        loginPage.Username("problemmm");
        loginPage.Password("secret_sauce");
        loginPage.LoginButton();
        String expected = "Epic sadface: Username and password do not match any user in this service";
        String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        Assert.assertTrue(actual.contains(expected));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.ClearUsername();
        loginPage.ClearPassword();
    }

    //Invalid Subscription With Empty UserName and Valid Password
    @Test(priority = 3)
    public void InValidLogin2() {
        loginPage = new LoginPage(driver);
        loginPage.Username("");
        loginPage.Password("secret_sauce");
        loginPage.LoginButton();
        String expected = "Epic sadface: Username is required";
        String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        Assert.assertTrue(actual.contains(expected));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.ClearUsername();
        loginPage.ClearPassword();
    }

    //Invalid Login With Valid UserName and Empty Password
    @Test(priority = 4)
    public void InValidLogin3() {
        loginPage = new LoginPage(driver);
        loginPage.Username("problem_user");
        loginPage.Password("");
        loginPage.LoginButton();
        String expected = "Epic sadface: Password is required";
        String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        Assert.assertTrue(actual.contains(expected));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.ClearUsername();
        loginPage.ClearPassword();
    }

    //Invalid Login With Valid UserName and InValid Password
    @Test(priority = 5)
    public void InValidLogin4() {
        loginPage = new LoginPage(driver);
        loginPage.Username("problemmm");
        loginPage.Password("secret_sauce");
        loginPage.LoginButton();
        String expected = "Epic sadface: Username and password do not match any user in this service";
        String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        Assert.assertTrue(actual.contains(expected));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.ClearUsername();
        loginPage.ClearPassword();
    }


    //Invalid Login With Valid UserName but in capital letters and Valid Password
    @Test(priority = 6)
    public void InValidLogin5() {
        loginPage = new LoginPage(driver);
        loginPage.Username("PROBLEM_USER");
        loginPage.Password("secret_sauce");
        loginPage.LoginButton();
        String expected = "Epic sadface: Username and password do not match any user in this service";
        String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        Assert.assertTrue(actual.contains(expected));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.ClearUsername();
        loginPage.ClearPassword();
    }

    //Invalid Login With Valid UserName and Valid Password but in Capital Letters
    @Test(priority = 7)
    public void InValidLogin6() {
        loginPage = new LoginPage(driver);
        loginPage.Username("problem_user");
        loginPage.Password("SECRET_SAUCE");
        loginPage.LoginButton();
        String expected = "Epic sadface: Username and password do not match any user in this service";
        String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        Assert.assertTrue(actual.contains(expected));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.ClearUsername();
        loginPage.ClearPassword();
    }

    //Invalid Login With Empty UserName and Empty Password
    @Test(priority = 8)
    public void InValidLogin7() {
        loginPage = new LoginPage(driver);
        loginPage.Username("");
        loginPage.Password("");
        loginPage.LoginButton();
        String expected = "Epic sadface: Username is required";
        String actual = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText();
        Assert.assertTrue(actual.contains(expected));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.ClearUsername();
        loginPage.ClearPassword();
    }


}

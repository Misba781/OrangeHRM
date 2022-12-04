package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class admin_login_pageObj extends Config {


    public admin_login_pageObj(WebDriver driver){
        PageFactory.initElements(driver,this);
        Config.driver = driver;
    }



    // Locator

    @FindBy (how =How.XPATH,using = "//input[@name='username']")
    public WebElement adminusernameLocator;

    @FindBy (how = How.XPATH, using = "//input[@name='password']")
    public WebElement adminpasswordLocator;

    @FindBy (how = How.XPATH, using = "//button[@type='submit']")
    public WebElement loginbuttonLocator;

    @FindBy (how = How.XPATH, using = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    public WebElement Dashboardtitlelocator;



  // Functions

    public void verifyloginpage () {
        String act = driver.getTitle();
        String exp = "OrangeHRM";
        Assert.assertEquals(exp, act);
        System.out.println("i am At login page");
    }
    public void enteradminusername(){
        adminusernameLocator.sendKeys("Admin");
    }

    public void enterinvalidadminusername(){
        adminusernameLocator.sendKeys("Adminlogin");
    }

    public void enteradminpassword(){
        adminpasswordLocator.sendKeys("admin123");
    }
    public void enterinvalidadminpassword(){
        adminpasswordLocator.sendKeys("password235");
    }
    public void clickonloginbutton(){
        loginbuttonLocator.click();
    }

    public void successfullyloginandlandeddashboardpage(){
        String exp = "OrangeHRM";
        String act = driver.getTitle();
        Assert.assertEquals(act, exp);
        System.out.println("Login unsucessful");
    }

    public void unsuccessfulllogin(){
        String exp = "OrangeHRM";
        String act = driver.getTitle();
        Assert.assertEquals(act, exp);
        System.out.println("Login unsucessful");
    }

}

package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.admin_login_pageObj;

public class admin_login_stepDef extends Config {

    admin_login_pageObj ALogIn = new admin_login_pageObj(driver);
    @Given("I am at OrangeHRM Login page")
    public void iAmAtOrangeHRMLoginPage() {

        ALogIn.verifyloginpage();
    }

    @And("I enter valid username")
    public void iEnterValidUsername() {
        ALogIn.enteradminusername();
    }

    @And("I enter valid password")
    public void iEnterValidPassword() {
        ALogIn.enteradminpassword();
    }

    @And("I enter invalid username")
    public void iEnterInvalidUsername() {
        ALogIn.enterinvalidadminusername();
    }

    @And("I enter invalid password")
    public void iEnterInvalidPassword() {
        ALogIn.enterinvalidadminpassword();
    }

    @When("I click on Login button")
    public void iClickOnLoginButton() {
        ALogIn.clickonloginbutton();

    }

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {
        ALogIn.successfullyloginandlandeddashboardpage();
    }

    @Then("I should not be able to successfully login")
    public void iShouldNotBeAbleToSuccessfullyLogin() {
        ALogIn.unsuccessfulllogin();
    }
}

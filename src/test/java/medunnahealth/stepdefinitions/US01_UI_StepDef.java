package medunnahealth.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import medunnahealth.pages.US01_UI_RegistrationPages;
import medunnahealth.utilities.ConfigurationReader;
import medunnahealth.utilities.Driver;
import org.junit.Assert;


public class US01_UI_StepDef {
    US01_UI_RegistrationPages us01UiRegistrationPages=new US01_UI_RegistrationPages();
    @Given("user navigates to Medunna url")
    public void user_navigates_to_medunna_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));

    }

    @Given("user click the registration ikon")
    public void user_click_the_registration_ikon() {
        us01UiRegistrationPages.registerIcon.click();


    }
    @Given("user click registration button")
    public void user_click_registration_button() {
        us01UiRegistrationPages.registerButton.click();

    }


    @Then("user provides valid ssn {string} number")
    public void user_provides_valid_ssn_number(String ssnNumber) {
    us01UiRegistrationPages.ssnBox.sendKeys(ssnNumber);

    }
    @Then("user should not see the error message Your SSN is required or Your SSN is invalid")
    public void user_should_not_see_the_error_message_your_ssn_is_required_or_your_ssn_is_invalid() {

        //Assert.assertFalse(us01UiRegistrationPages.ssnMessage.isDisplayed());

//        String gerycolor = us01UiRegistrationPages.ssnBox.getCssValue("color");
//        System.out.println("GREY "+gerycolor);
//        Assert.assertTrue(gerycolor.contains("rgba(34, 34, 34, 1)"));

//        @Then("Assert that Email Label is grey color")
//        public void assert_that_email_label_is_grey_color() {
//            registrationPage=new RegistrationPage();
//            String gerycolor = registrationPage.emailLabel.getCssValue("color");
//            System.out.println("GREY "+gerycolor);
//            Assert.assertTrue(gerycolor.contains("rgba(34, 34, 34, 1)"));
//        }
//        @Then("Assert that Email Label is red color")
//        public void assert_that_email_label_is_red_color() {
//            registrationPage=new RegistrationPage();
//            String gerycolor = registrationPage.emailLabel.getCssValue("color");
//            System.out.println("RED "+gerycolor);
//            Assert.assertTrue(gerycolor.contains("rgba(240, 65, 36, 1)"));

        String ssnBoxAttribute = us01UiRegistrationPages.ssnBox.getAttribute("class");
        Assert.assertFalse(ssnBoxAttribute.contains("invalid"));
        Assert.assertTrue(ssnBoxAttribute.contains("valid"));

    }

}

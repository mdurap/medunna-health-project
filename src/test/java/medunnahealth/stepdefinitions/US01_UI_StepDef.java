package medunnahealth.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import medunnahealth.pages.US01_UI_RegistrationPage;
import medunnahealth.utilities.ConfigurationReader;
import medunnahealth.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class US01_UI_StepDef {
    US01_UI_RegistrationPage us01UiRegistrationPage=new US01_UI_RegistrationPage();
    @Given("user navigates to Medunna url")
    public void user_navigates_to_medunna_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunna_url"));
    }
    @Given("user click the registration icon")
    public void user_click_the_registration_icon() {
        us01UiRegistrationPage.registerIcon.click();
    }
    @Given("user click registration button")
    public void user_click_registration_button() {
        us01UiRegistrationPage.registerButton.click();
    }


    @Then("user provides valid ssn {string} number")
    public void user_provides_valid_ssn_number(String ssnNumber) {
 // us01UiRegistrationPage.ssnBox.sendKeys(ssnNumber);
    us01UiRegistrationPage.ssnBox.sendKeys(ssnNumber+ Keys.TAB);
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

        String ssnBoxAttribute = us01UiRegistrationPage.ssnBox.getAttribute("class");
        Assert.assertFalse(ssnBoxAttribute.contains("invalid"));
//        Assert.assertTrue(ssnBoxAttribute.contains("valid"));
    }
    @Then("user provides invalid ssn {string} number")
    public void user_provides_invalid_ssn_number(String ssnInvalid) {
       us01UiRegistrationPage.ssnBox.sendKeys(ssnInvalid+ Keys.TAB);
//        us01UiRegistrationPages.ssnBox.sendKeys(ssnInvalid);
    }
    @Then("user should see the error message Your SSN is invalid")
    public void user_should_see_the_error_message_your_ssn_is_invalid() {
        Assert.assertTrue(us01UiRegistrationPage.ssnIsInvalidMessage.isDisplayed());
    }
    @Then("user leaves ssn box blank")
    public void user_leaves_ssn_box_blank() {
        us01UiRegistrationPage.ssnBox.sendKeys(""+ Keys.TAB);
    }
    @Then("user should see the error message Your SSN is required.")
    public void user_should_see_the_error_message_your_ssn_is_required() {
        Assert.assertTrue(us01UiRegistrationPage.ssnIsRequiredMessage.isDisplayed());
    }


    @Then("user provides valid firstname {string} that contains any chars")
    public void user_provides_valid_firstname_that_contains_any_chars(String firstName) {
        us01UiRegistrationPage.firstNameBox.sendKeys(firstName+ Keys.TAB);
    }

    @Then("user should not see the error message Your FirstName is required.")
    public void user_should_not_see_the_error_message_your_first_name_is_required() {
        String firstNameBoxAttribute = us01UiRegistrationPage.firstNameBox.getAttribute("class");
        Assert.assertTrue(firstNameBoxAttribute.contains("valid"));
    }

    @Then("user leaves firstname box blank")
    public void user_leaves_firstname_box_blank() {
        us01UiRegistrationPage.firstNameBox.sendKeys(""+ Keys.TAB);
    }
    @Then("user should see the error message Your FirstName is required.")
    public void user_should_see_the_error_message_your_first_name_is_required() {
        Assert.assertTrue(us01UiRegistrationPage.firstNameIsRequiredMessage.isDisplayed());
    }

    @Then("user provides valid lastname {string} that contains any chars")
    public void user_provides_valid_lastname_that_contains_any_chars(String lastName) {
        us01UiRegistrationPage.lastNameBox.sendKeys(lastName+ Keys.TAB);
    }
    @Then("user should not see the error message Your LastName is required.")
    public void user_should_not_see_the_error_message_your_last_name_is_required() {
        String lastNameBoxAttribute = us01UiRegistrationPage.lastNameBox.getAttribute("class");
        Assert.assertTrue(lastNameBoxAttribute.contains("valid"));
    }
    @Then("user leaves lastname box blank")
    public void user_leaves_lastname_box_blank() {
        us01UiRegistrationPage.lastNameBox.sendKeys(""+ Keys.TAB);
    }
    @Then("user should see the error message Your LastName is required.")
    public void user_should_see_the_error_message_your_last_name_is_required() {
        Assert.assertTrue(us01UiRegistrationPage.lastNameIsRequiredMessage.isDisplayed());
    }

}

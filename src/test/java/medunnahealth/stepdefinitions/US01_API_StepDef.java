package medunnahealth.stepdefinitions;

import io.cucumber.java.en.*;
import medunnahealth.pages.US01_API_RegistrationPage;
import medunnahealth.pages.US01_UI_RegistrationPage;
import medunnahealth.utilities.ConfigurationReader;
import medunnahealth.utilities.Driver;

public class US01_API_StepDef {
    US01_API_RegistrationPage us01APIRegistrationPage=new US01_API_RegistrationPage();

    @Given("user provides valid body from Swagger")
    public void user_provides_valid_body_from_swagger() {
        Driver.getDriver().get(ConfigurationReader.getProperty("registration_url"));
    }
    @Given("user send post request to url {string}")
    public void user_send_post_request_to_url(String string) {


    }
    @Then("verify status code is {int}")
    public void verify_status_code_is(Integer int1) {

    }
    @Then("assert email, login, firstname, lastname, ssn with given data in body")
    public void assert_email_login_firstname_lastname_ssn_with_given_data_in_body() {

    }

}

package medunnahealth.pages;

import medunnahealth.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class US01_API_RegistrationPage {
    public US01_API_RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}

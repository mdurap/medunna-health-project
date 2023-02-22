package medunnahealth.pages;

import medunnahealth.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class US01_UI_RegistrationPages {

    public US01_UI_RegistrationPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement registerIcon;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement ssnMessage;

}

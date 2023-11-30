package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudyMateLoginPage {

    public StudyMateLoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passWordField;

    @FindBy (xpath = "//button[contains(text(),'Log in')]")
    public WebElement loginButton;

}

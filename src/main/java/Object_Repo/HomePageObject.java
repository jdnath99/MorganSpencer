package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {

    WebDriver driver;

    public HomePageObject(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"inputName\"]")
    WebElement Yournamefield;

    @FindBy(xpath = "//*[@id=\"inputBirthday\"]")
    WebElement Yourbirthday;

    @FindBy(xpath = "//*[@id=\"submitButton\"]")
    WebElement ClickSubmitbutton;

    public void Enteryourname(String yourname){
        Yournamefield.sendKeys(yourname);
    }

    public void Enteryourbirthday(String yourbirthday){
        Yourbirthday.sendKeys(yourbirthday);
    }

    public void Submitbutton(){
        ClickSubmitbutton.click();
    }

}

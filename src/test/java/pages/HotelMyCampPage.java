package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath ="//span[text()='Try again please']" )
    public WebElement girisYapilamadiElementi;

    @FindBy(xpath ="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButonu;

    @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement saveSuccessfullytext;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement saveSuccesOkTusu;

     public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
public void girisYap(){
         Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
         ilkLoginLinki.click();
         userNameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
         passwordBox.sendKeys(ConfigReader.getProperty(("HMCValidPassword")));
         loginButonu.click();
}

}

package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {
    public HMCWebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirDatalar;

    @FindBy(xpath = "//body")
    public WebElement tumBodyWebelementi;

    @FindBy(xpath = "//body//td")
    public List<WebElement> tumBodyDtalariList;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;

    public WebElement satirGetir(int satirNo){
        String satirDianmikXpath="//tbody//tr["+satirNo+"]";
        WebElement satirElementi=Driver.getDriver().findElement(By.xpath(satirDianmikXpath));
        return satirElementi;
    }

    public String  hucreWebelementGetir(int satir, int sutun) {
        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        String dinamikHucreXpath="//tbody//tr["+ satir  +"]//td["+ sutun  +"]";
        WebElement istenenHucreElementi=Driver.getDriver().findElement(By.xpath(dinamikHucreXpath));
        String hucreDatasi=istenenHucreElementi.getText();

        return hucreDatasi;
    }

    public void sutunYazdir(int sutun) {

        int satirsayisi=satirlarListesi.size();

        for (int i=1; i<=satirsayisi; i++){
            System.out.println(hucreWebelementGetir(i, sutun));
        }
    }
    //2.satir yazdir //tbody//tr[2]
        //7. satir yazdir //tbody//tr[7]




}


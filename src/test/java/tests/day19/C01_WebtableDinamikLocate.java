package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebtableDinamikLocate {
    // 3 test methodu olusturalim
    // 1. method satir numarasi verdigimde bana o satirdaki datalari yazdirsin
    // 2.method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
    // 3. sutun numarasi vedigimde tum sutunu yazdirsin

    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTesti(){
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        //2.satir yazdir //tbody//tr[2]
        //7. satir yazdir //tbody//tr[7]
    hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncusatirElementi=hmcWebTablePage.satirGetir(4);
        System.out.println(ucuncusatirElementi.getText());
        Driver.closeDriver();
    }

   @Test
    public void hucreGetirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        // 2. method satir no ve data numarasi girdigimde verdigim datayi yazdirsin
        hmcWebTablePage=new HMCWebTablePage();

        // 2.satirin 4.datasi   //tbody//tr[2]//td[4]
        // 4.satirin 5.datasi   //tbody//tr[4]//td[5]

        System.out.println("girdiginiz hucredki element : "+hmcWebTablePage.hucreWebelementGetir(5,3));
        Driver.closeDriver();
    }

    @Test
        public void sutunYazdirTesti(){
      hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hmcWebTablePage=new HMCWebTablePage();
        hmcWebTablePage.sutunYazdir(4);
        }

    }


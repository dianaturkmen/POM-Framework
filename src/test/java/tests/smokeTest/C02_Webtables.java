package tests.smokeTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_Webtables {
    HotelMyCampPage hotelMyCampPage;
    HMCWebTablePage hmcWebTablePage;

    @Test
    public void loginT(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
    }

    @Test (dependsOnMethods = "loginT")
    public void table(){
        hmcWebTablePage=new HMCWebTablePage();
        List<WebElement> headerDataList=hmcWebTablePage.headerBirinciSatirDatalar;
        System.out.println("tablodaki sutun sayisi: "+ headerDataList.size());
        System.out.println(hmcWebTablePage.tumBodyWebelementi.getText());

        List<WebElement> bodyTumDataList=hmcWebTablePage.tumBodyDtalariList;
        System.out.println("body'deki data sayisi: "+ bodyTumDataList.size());
    }
    // ● Bir class oluşturun : C02_WebTables
    //
    //● login( ) metodun oluşturun ve oturum açın.
    //
    //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
    //
    //            ○ Username : manager
    //
    //            ○ Password : Manager1!
    //
    //● table( ) metodu oluşturun

    //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
    //
    //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
    //

    @Test (dependsOnMethods = "loginT")
    public void printRows(){
        hmcWebTablePage=new HMCWebTablePage();
        System.out.println(hmcWebTablePage.satirlarListesi.size());
        List<WebElement> satirlarWebElementListesi=hmcWebTablePage.satirlarListesi;
        for (WebElement each:satirlarWebElementListesi
             ) {
            System.out.println(each.getText());
        }

     //● printRows( ) metodu oluşturun //tr
    //
    //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
    //
    //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
    //
    //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
        System.out.println("4.satir:" +satirlarWebElementListesi.get(3).getText());
    }

}

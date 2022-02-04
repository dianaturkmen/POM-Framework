package tests.smokeTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;

import java.util.List;

public class C02_Webtables {
    HotelMyCampPage hotelMyCampPage;
        HMCWebTablePage,

    @Test
    public void loginT(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
    }

    @Test
    public void table(){
        HMCWebTablePage
        List<WebElement> headerDataList=
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
    //
    //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
    //
    //            ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
    //
    //● printRows( ) metodu oluşturun //tr
    //
    //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
    //
    //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
    //
    //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.
}

package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebtableDemoqa {

    @Test
    public void demoqaTest() {
        //  1. “https://demoqa.com/webtables” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));
        //  2. Headers da bulunan department isimlerini yazdirin

        DemoqaPage demoqaPage = new DemoqaPage();

        System.out.println(demoqaPage.basliksatiriElementi.getText());
        //  3. sutunun basligini yazdirin

        System.out.println("3.sutun baslik" + demoqaPage.basliklarWebelementiListesi.get(2).getText());


        //  4. Tablodaki tum datalari yazdirin


        //
        //  5. Tabloda kac cell (data) oldugunu yazdirin
        //
        //  6. Tablodaki satir sayisini yazdirin
        //
        //  7. Tablodaki sutun sayisini yazdirin
        demoqaPage.sutunYazdir(3);

        //  8. Tablodaki 3.kolonu yazdirin
        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
    }
}

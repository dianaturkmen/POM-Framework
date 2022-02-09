package tests.day20;

import org.testng.annotations.Test;

public class C05_ExceliMapaYukleme {

    @Test
    public void test01(){
        //dosya yolu ve sayfa ismi verilen bir excel sheet i Map olarak kaydeden
        // reusable bir method lusturalim
        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";
        ReusableMethodsExcel.mapOlustur(path, sayfaAdi);


    }
}

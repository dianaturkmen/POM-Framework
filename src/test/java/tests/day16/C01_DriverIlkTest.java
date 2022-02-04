package tests.day16;

import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest{

@Test
    public void test01(){
    //amazona gidelim
    Driver.getDriver().get("https://www.amazon.com");

    //amazona gittigimizi test edelim
    String actualTitle=Driver.getDriver().getTitle();
    String actualUrl=Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(actualTitle.contains("Amazon"));
    Driver.closeDriver();
}

@Test
    public void test02(){
    //bestbuy anasayfaya gidelim
    Driver.getDriver().get("https://www.bestbuy.com");
    //bestbuya gittigimizi test edelim
    String actualUrl=Driver.getDriver().getCurrentUrl();
    Assert.assertTrue(actualUrl.contains("bestbuy"));
    Driver.closeDriver();
}

}
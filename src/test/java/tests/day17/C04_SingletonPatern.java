package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPatern {

    @Test
    public void test1(){
        // singleton patern bir classtan birden fazla obje uretilmesine
        // izin vermeyen bir patern olarak kabul gormustur

        // Driver class'ini driver uretmek icin kullaniyoruz
        // ancak Driver classinda driver isminde bir instance variable da var
        // ve biz obje ureterek bu instance driver a ulasabiliriz

            //Driver driver=new Driver();
            //Driver driver1=new Driver();
            //Driver driver2=new Driver();

        // Singleton pattern kabul gormus bir pattern'dir
        // amac bir class'dan obje uretilmemesini saglamaktir
        // bunun icin singleton pattern'de koruyacagim,iz class'da
        // parametresiz bir constructor olusturur ve
        // bu constructor'i private yapariz
    }
}

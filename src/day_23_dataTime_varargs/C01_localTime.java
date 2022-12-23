package day_23_dataTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01_localTime {
    public static void main(String[] args) {
        LocalTime zaman = LocalTime.now();

        System.out.println(zaman);//12:08:20.352086800


        System.out.println(zaman.getMinute());//10

        System.out.println(zaman.withSecond(0).withNano(0));//12:10

        System.out.println(zaman.withSecond(1).withNano(1));//12:10:01.000000001


        System.out.println(zaman.plusHours(100).plusNanos(250));//16:11:56.849398350

        // bir for loop ile  1'den 10000'e kadar olan sayıları yanyana yazdırın
        // bu işlem için geçen zamanı bulun

        LocalTime baslangıcZamanı=LocalTime.now();

        System.out.println(baslangıcZamanı);//12:19:03.187204900

        for (int i = 1; i <=100000 ; i++) {
            System.out.print(i +" ");

        }
        LocalTime bitişZamanı=LocalTime.now();
        System.out.println("");
        System.out.println("bitiş " + bitişZamanı);//bitiş 12:19:04.099638900

        System.out.println("Islem suresi : " +
                (bitişZamanı.getNano()-baslangıcZamanı.getNano())
                +" nano saniye");

        /*
            Olusturdugumuz time veya date guncel zamani veya tarihi tutmaya devam eden bir sayac degil
            olusturdugumuz satirdaki zamani veya tarih'i sistemden alip kaydeden bir variable'dir

            ilerleyen satirlarda guncel zaman veya tarihe ihtiyacimiz oldugunda
            yeni bir time veya date objesi olusturup
            o andaki degeri alabiliriz.
         */
    }
}

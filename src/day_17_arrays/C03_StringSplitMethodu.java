package day_17_arrays;

import java.util.Arrays;

public class C03_StringSplitMethodu {
    public static void main(String[] args) {

        String str = "Java her geçen gün dahada güzelleşiyor.";

        //str'de kaç kelime vardır.
        //split methodu istedigimiz String'i İSTEDİGİMİZ EYRAC KULLANARAK
        //parçalara ayırmamızaimkan tanır.

        String[] spaceSplit=str.split(" ");

        System.out.println(Arrays.toString(spaceSplit));//[Java, her, geçen, gün, dahada, güzelleşiyor.]

        System.out.println("Verilen cümledeki kelime sayısı: " + spaceSplit.length);//Verilen cümledeki kelime
        // sayısı: 6

        System.out.println(Arrays.toString(str.split("gün")));//[Java her geçen ,  dahada güzelleşiyor.]

        System.out.println(Arrays.toString(str.split("")));
        //[J, a, v, a,  , h, e, r,  , g, e, ç, e, n,
        // , g, ü, n,  , d, a, h, a, d, a,  , g, ü, z, e, l, l, e, ş, i, y, o, r, .]
    }
}

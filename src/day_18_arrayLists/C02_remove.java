package day_18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_remove
{
    public static void main(String[] args)
    {
        List<String>harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("Z");
        harfler.add("T");
        System.out.println(harfler);//[A, Z, T]

        harfler.remove("T");
        System.out.println(harfler);//[A, Z]
        System.out.println(harfler.remove(0));// A silindi.
        // 0.index'deki elementi siler ve gorevi tamamlayip silinen elementi bize dondurur

        System.out.println(harfler);//[Z]

        List<String> yeniHarfler= new ArrayList<>();
        yeniHarfler.add("C");
        yeniHarfler.add("D");
        yeniHarfler.add("Z");

        System.out.println(yeniHarfler.removeAll(harfler));
        // harfler listesindeki tum elementleri yeniList'den siler
        // gorevi tamamlarsa true, yoksa false done

        System.out.println(yeniHarfler);//[C, D]
        System.out.println(harfler);//[Z]



    }
}

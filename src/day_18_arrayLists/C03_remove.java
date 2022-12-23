package day_18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_remove
{
    public static void main(String[] args)
    {
        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(9);
        System.out.println(sayılar);//[10, 5, 7, 9]

        // sayilar.remove(5); // IndexOutOfBoundsException
         /*
            eger listemiz Integer'lardan olusuyorsa
            parametre olarak yazdigimiz sayinin index mi yoksa silmek istedigimiz obje mi oldugu
            belirsiz olmasin diye
            Java otomatik olarak girilen sayiyi index kabul eder
            Eger Integer'lardan olusan bir listede
            obje olarak bir elementi silmek isterseniz
            once onu tanimlamalisiniz
         */
        Integer silinecekElement= 5;
        System.out.println(sayılar.remove(silinecekElement));//true
        System.out.println(sayılar);//[10, 7, 9]


    }
}

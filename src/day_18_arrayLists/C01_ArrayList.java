package day_18_arrayLists;

import day_16_arrays.C10_ArrayeBirElementEkleme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList
{
    public static void main(String[] args)
    {
        String [] arr ={"A","B","T"};
        // bu array'e element olarak C eklemek istersek

        arr=C10_ArrayeBirElementEkleme.arrayeElementEkleme(arr,"C");
        System.out.println(Arrays.toString(arr));//[A, B, T, C]
        // ArrayList esnek uzunluktaki bir array'dir
        // Ancak ArrayList, array altyapisini kullandigindan
        // elementleri sadece tek tek ekleyebiliriz


        List<String>harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("T");

        System.out.println(harfler);//[A, B, T]

        harfler.add("C");
        System.out.println(harfler);//[A, B, T, C]

        harfler.add(2,"K");//[A, B, K, T, C]
        System.out.println(harfler);
        harfler.add(3,"D");//K ile T'nin arasına D ekleyelim
        System.out.println(harfler);

        List<String>karakter=new ArrayList<>();
        karakter.add("*");
        karakter.add("#");
        System.out.println(karakter);

        harfler.addAll(2,karakter);
        System.out.println(harfler);

    }
}

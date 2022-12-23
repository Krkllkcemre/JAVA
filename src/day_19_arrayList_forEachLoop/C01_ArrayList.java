package day_19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_ArrayList
{
    public static void main(String[] args)
    {
        // Soru 6- Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.
        Scanner scan= new Scanner(System.in);
        System.out.println("Tam bolenlerini listelemek icin pozitif bir tamsayi girin");
        int girilenSayi= scan.nextInt();
       if (girilenSayi<=0)
       {
           System.out.println("Geçersiz sayı");
       }
       else {
           List<Integer>tamBolenlerListesi=tamBolenlerListesOlustur(girilenSayi);
           System.out.println(tamBolenlerListesi);

       }
    }
    public static List<Integer>tamBolenlerListesOlustur(int girilensayı)
    {
        List<Integer>tamBolenlerListesi=new ArrayList<>();

        for (int i = 1; i <girilensayı ; i++)
        {
            if (girilensayı%i==0)
            {
                tamBolenlerListesi.add(i);
            }
        }
return tamBolenlerListesi;
    }
}

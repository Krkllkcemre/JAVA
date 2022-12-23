package day_16_arrays;

import java.util.Arrays;
import java.util.Scanner;

import static day_16_arrays.C10_ArrayeBirElementEkleme.arrayeElementEkleme;

public class C12_odev {
    public static void main(String[] args) {
        // Kullanıcıdan yeni isimler alıp, var olan bir array'e ekleyen bir method oluşturun.
        //Kullanıcı yeni değer verdiği müddetçe, C10'daki methodu kullanarak eklemeye devam edin,
        // kullanıcı Q'ya bastığında array'in son halini döndürün.

        Scanner scan = new Scanner(System.in);
        String YeniIsim = "";
        String[] isimler = {"Neymar", "Ronaldo", "Messi"};
        String dur = "Q";
        while (!YeniIsim.equals(dur)) {
            System.out.println("Lutfen isim giriniz");
            YeniIsim = scan.nextLine();
            isimler = arrayeElementEkleme(isimler, YeniIsim);
        }
        System.out.println(Arrays.toString(isimler));
    }
}
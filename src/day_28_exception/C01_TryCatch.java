package day_28_exception;

import java.util.Scanner;

public class C001_TryCatch {
    public static void main(String[] args) {
        //Kullanıcıdan ikisayı alıp
        //sayıları birbirine bölüp yazdıralım


        Scanner scan = new Scanner(System.in);
        System.out.println("Birbirine bölmmek için ikisayı girelim");


        int sayı1= scan.nextInt();
        int sayı2= scan.nextInt();


        try {
            // 1-try bölümü= yapmak istediginiz ama axc. riski oluşturan kodlar
            System.out.println("İki sayının bölümü " + sayı1 / sayı2);
        }catch (ArithmeticException e)
                // 2 - catch () : bekledigimiz muhtemel exception ve
                //               bu exc. gerçekleşirse hata dokumanına store edebilecegimiz variable

        {
            System.out.println("Bölecek sayı 0 olamaz");
           e.printStackTrace();
        }
    }
}

package day_05_if_Statements;

import java.util.Scanner;

public class C02_ifStatemens {
    public static void main(String[] args) {

        /*
        Basit ifcümleleri kodun diger kalanından bagımsızdır.
        sadece birşartta odaklanır

         */
        //kullanıcıdan bir sayı alın
        // pozitif ise 'pozitif ssayı'
        //100 ile 999 arasında ise(sinırlar dahil) "pozitif 3 basamaklı sayı"
        // 3 ile bölüne biliyorsa "3"ün katı"
        // bir basamagı 7 ise "mükemmel"
        //seçeneklerden uygun olanı yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz.");
        int sayı= scan.nextInt();

        if (0<sayı){
            System.out.println("pozitif");}
        if (100<=sayı && sayı<=999){
            System.out.println("pozitif 3 basamaklı sayı");}
        if (sayı%3==0){
            System.out.println("3'ün katı");}
        if (sayı%10==7){
            System.out.println("mükkemmel");}
    }
}

package day_06if_else_statements;

import java.util.Scanner;

public class C04_if_else_statements { public static void main(String[] args) {

        /*
 Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
olup olmadigini yazdirin.
         */
    System.out.println("Lütfen bir harf giriniz.");
    Scanner scan = new Scanner(System.in);
    char hrf= scan.next().charAt(0);

    if(hrf>='A' && hrf <= 'Z'){
        System.out.println("girilen harf büyük harf");}
    else {
        System.out.println("girilen har büyük harf degil");}
}}

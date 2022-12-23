package day_11_forloops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen başlangıç ve bitiş degeri girin.");

        int başlangıçD= scanner.nextInt();
        int bitişD= scanner.nextInt();
 if (bitişD < başlangıçD){
        System.out.println("Baslangic degeri bitis degerinden kucuk olmali");}


 else if (başlangıçD<bitişD) {

            int toplam=0;
            for (int i = başlangıçD ; i<bitişD; i++)

                toplam+=i;
        System.out.println(başlangıçD + " ile " + bitişD + " arasindaki sayilarin toplami : " + toplam);}

    }}


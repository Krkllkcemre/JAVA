package day_23_dataTime_varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        //Öle bir method oluşturalım ki
        //Kaçtane argument yazarsam yazayım
        //argumentlerin toplamını versin

        topla(5,6);
        topla(5,8,2);
        topla(4,5,6,8,24,5);
        /*
        Varargs array altyapısını kullanır
        Temel hedef argument sayısı degilse bile
        aynı data turundeki tum argumentler alabilecek bir parametre oluşturmaktır.
         */

    }
    private static void topla (int ...sayılar)
    {int toplam1=0;
        for (int i = 0; i < sayılar.length; i++)
        {
            toplam1 += sayılar[i];

        }
        System.out.println(toplam1);


        int toplam2= 0;

        for (int each:sayılar
             ) {
            toplam2 +=each;
        }
        System.out.println(toplam2);
    }
}

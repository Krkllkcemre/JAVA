package day_19_arrayList_forEachLoop;

public class C03_ForEachLoop
{
    public static void main(String[] args)
    {
 /*
            Eger coklu element iceren bir yapidaki tum elementlere
            ayni islemi yapmak istiyorsak
            index'den bagimsiz olarak for each loop kullanilabilir
            for each loop'da 3 seyi belirtmemiz gerekir
            1- getirilecek elementlerin data turu
            2- getirilen elemnte verilecek isim (genelde each / w kullanilir)
            3- nereden getirilecegi
         */
        int[] arr = {2,4,6,8,1};
        // bu array'in tum elementlerini yazdiralim

        for ( int each: arr)
        {
            System.out.print(each+ " ");
        }
        System.out.println("");

        // tum elemanları toplayın.

        int toplam= 0;

        for (int each: arr
             ) {
            toplam+=each;

        }System.out.println("sayilarin toplami : " + toplam);


        // sayıların karesini toplasak


        int topla = 0 ;


        for ( int each:arr
             ) {
            topla+=each*each;
        }
        System.out.println("sayıların karesinin toplamı " + topla);

    }
}

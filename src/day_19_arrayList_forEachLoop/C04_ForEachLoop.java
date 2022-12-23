package day_19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop
{
    public static void main(String[] args)
    {
        Integer [] arr ={2,3,4,6,3,4,6,1,8,5,4};

        List<Integer>sayılılar=new ArrayList<>();

        // array'deki tum elementleri liste kopyalayalim


        for (Integer each:arr
             ) {

            sayılılar.add(each);

        }System.out.println(sayılılar);//[2, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]
        // array'deki cift sayilari olusturacagimiz bir list'e tasiyalim

        List<Integer>arrydekiÇiftSayılar=new ArrayList<>();

        for (int each:arr
             ) {
            if (each%2==0)
            {
               arrydekiÇiftSayılar.add(each);//[2, 4, 6, 4, 6, 8, 4]
            }

        }
        System.out.println(arrydekiÇiftSayılar);


    }
}

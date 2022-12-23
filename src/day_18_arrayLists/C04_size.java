package day_18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_size
{
    public static void main(String[] args)
    {
        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(10);
        sayılar.add(5);
        sayılar.add(7);
        sayılar.add(9);

        System.out.println(sayılar);//[10, 5, 7, 9]

        System.out.println(sayılar.size());//4
        System.out.println(sayılar.isEmpty());//false

        sayılar.clear();// sayılardaki tüm elementlerisier.

        System.out.println(sayılar.size());//0
        System.out.println(sayılar.isEmpty());//true
        System.out.println(sayılar);//[]


    }
}

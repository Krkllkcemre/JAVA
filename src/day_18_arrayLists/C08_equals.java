package day_18_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_equals
{
    public static void main(String[] args)
    {
        List<Integer>sayılar1=new ArrayList<>();

        sayılar1.add(10);
        sayılar1.add(20);


        List<Integer>sayılar2=new ArrayList<>();

        sayılar2.add(20);
        sayılar2.add(10);


        System.out.println(sayılar1.equals(sayılar2));//false

        List<Integer>sayılar3=new ArrayList<>();

        sayılar3.add(20);
        sayılar3.add(10);

        System.out.println(sayılar2.equals(sayılar3));//true




    }
}

package day_17_arrays;

import java.util.Arrays;

public class C04_MutiDimesionalArrays {
    public static void main(String[] args) {
        int[][]arr={ {1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5,}};

        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//4

        System.out.println(arr[2][1]);//7

        System.out.println(arr[3]);//[I@48140564

        // Multidimesonal array ile çalışırken dikkatetmemiz gereken en önemli konu
        //yazdıgımız kodun bir array mi yoksa yazdırabilecegimizbir element mi döndürdüğüdür.

        System.out.println(Arrays.toString(arr[3]));//[2]

        //21.satırdaki 2 element yadırmak istersek

        System.out.println(arr[3][0]);//2

        //MDA'in tümünü yazdırmak isterseniz
        // tek katlı arrayleri yazdırmak için kullandıgımız yöntem yeterli olmaz

        System.out.println( );
    }
}

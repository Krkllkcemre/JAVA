package day_17_arrays;

public class C05_MDA {
    public static void main(String[] args) {


        int[][]arr={ {1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5,}};

        // verilen 2 katlı MDA'daki tüm sayıların toplamnını yazdıran bir methodoluşturun

        tumSayılarınTopla(arr);


    }

    public static void tumSayılarınTopla(int[][]arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {//outer array için
            for (int j = 0; j < arr[i].length; j++) {  // inner array'ler için

                toplam +=arr[i][j];

            }

        }
        System.out.println("Array'deki sayıların toplamı: "  + toplam);
    }
}

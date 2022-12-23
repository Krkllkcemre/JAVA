package day_17_arrays;

public class C06_MDA {
    public static void main(String[] args) {

        //Verilen iki  katlı String bir array'de
        // İstenen metni içeren elementleriv yazdıran bir method oluşturun

        String[][]arr={{"Ali", "Zafer"}, {"Betül","Hüseyin","Hasan"},{"Said"}};

        String arananMetin="a";


        istenenElementleriYazdırın(arr,arananMetin);

    }

    public static void istenenElementleriYazdırın(String[][]arr,String arananMetin){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].contains(arananMetin)){
                    System.out.println(arr[i][j] + " ");

                }
            }


        }
    }

}

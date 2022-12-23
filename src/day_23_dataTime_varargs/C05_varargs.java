package day_23_dataTime_varargs;

public class C05_varargs {
    public static void main(String[] args) {
        //verilen 2 sayının toplayıp yazdıran bir method oluşturun

        topla(5,8);
        topla(5,7,3);


    }
    private static void topla (int sayı1, int sayı2 , int sayı3 , int sayı4){

        System.out.println("Dort sayının toplamı : " + (sayı1+sayı2+sayı3+sayı4));
    }


    private static void topla (int sayı1, int sayı2)
    {
        System.out.println("Dort sayının toplamı : " + (sayı1+sayı2));
    }


    private static void topla (int sayı1, int sayı2 , int sayı3){
        System.out.println("Dort sayının toplamı : " + (sayı1+sayı2+sayı3));
    }
}

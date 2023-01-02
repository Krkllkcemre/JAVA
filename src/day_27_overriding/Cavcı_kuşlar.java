package day_27_overriding;

public class Cavcı_kuşlar extends Bkuşlar {
    protected void hareket()
    {
        System.out.println("Uçarlar");
    }  protected void beslenme( ) {
        System.out.println("et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelilerdir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagalı");
    }

    public static void main(String[] args) {
        Cavcı_kuşlar krt1=new Cavcı_kuşlar();
        krt1.hareket();//Uçarlar
        krt1.beslenme();//et yerler
        krt1.pence();//pencelilerdir
        krt1.gaga();//sivri gagalı
        krt1.kanat();//kanatlidirlar
        krt1.solunum();//akcigerle nefes alirlar
        krt1.cogalma();//yumurtayla cogalirlar
        krt1.omur();//yasar ve olurler

        /*
        eğer constructor ile data turu aynı ise
        özelligin varianle veya method olmasına bakılmaksızın
        a class'a gidilir, a class veya parent class'larda
        bunu İLK DEGER kullanılır
         */

        Bkuşlar krt2=new Cavcı_kuşlar();

        krt2.hareket();//Uçarlar
        krt2.beslenme();//et yerler
        //krt2.pence();//Bkuşlar veya parent class'da yok CTE verir.
        krt2.gaga();//sivri gagalı
        krt2.kanat();// b kanatlidirlar
        krt2.solunum();// b akcigerle nefes alirlar
        krt2.cogalma();// b yumurtayla cogalirlar
        krt2.omur();// a yasar ve olurler

        Ahayvanlar krt3=new Cavcı_kuşlar();
        krt3.hareket();// c Uçarlar
        krt3.beslenme();// c et yerler
        //krt3.pence();//Ahayvanlarda  yok CTE verir.
        //krt3.gaga();//Ahayvanlarda  yok CTE verir.
        //krt3.kanat();//Ahayvanlarda  yok CTE verir.
        krt3.solunum();// b akcigerle nefes alirlar
        krt3.cogalma();// b yumurtayla cogalirlar
        krt3.omur();// a yasar ve olurler
    }

}

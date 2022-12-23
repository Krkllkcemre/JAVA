package day_23_dataTime_varargs;

public class C07_Varargs
{
    public static void main(String[] args)
    {
        // Kaçtane String argument yazılırsa yazılsın
        // Argumentlerin en uzun olanını yazdıran birmetod oluşturun
        // Not: en uzun kelime olarak birden fazla kelime varsa ,ilkini yazdırın.

        enUzunYzdır("Ilyas","Berivan","Murat");


    }
    private  static void enUzunYzdır(String ...kelimeler)
    {
        String enUzunKelime= kelimeler[0];

        for (String eachKelime:kelimeler
             ) {
            if (eachKelime.length()>=enUzunKelime.length())
            {
               enUzunKelime=eachKelime;
            }
        } System.out.println(enUzunKelime);
    }
}

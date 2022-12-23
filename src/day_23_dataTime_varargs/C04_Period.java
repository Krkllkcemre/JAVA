package day_23_dataTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {


        LocalDate dogumTarihi=LocalDate.of(1993,9,10);

        LocalDate bugun=LocalDate.now();

        Period yas= Period.between(dogumTarihi,bugun);

        System.out.println(yas);//P29Y3M10D== yani 29 yıl 3 ay 10 gün
        System.out.println(yas.getYears());//29

        LocalDate baslangıc= LocalDate.of(2011,9,15);
        LocalDate bitiş = LocalDate.of(2021,9,17);

        Period rize= Period.between(baslangıc,bitiş);
        System.out.println(rize);//P10Y2D



    }
}

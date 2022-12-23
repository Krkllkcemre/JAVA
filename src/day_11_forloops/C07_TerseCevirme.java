package day_11_forloops;

public class C07_TerseCevirme {
    public static void main(String[] args) {
        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.


        String str= "Java ogrenmek icin cok calismak lazim";

        String tersStr="";

        for (int i =str.length()-1 ; i>=0 ; i--) {

            tersStr +=str.substring(i,i+1);
        }

        System.out.println("Girilen cümlenin tersten yazılışı= " +tersStr);



    }
}

package day_07ternary_switchStatements;

public class C11_swicht_statement {
    public static void main(String[] args) {
        /*
        Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek
        istedigini alin ve girilen harfin karsiligini yazdirin.
           I : International S : Software T : Testing Q : Qualifications B: Board
         */
        char harf='i';

        switch (harf){
            case 'İ':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
            case 'B':
            case 'b':
                System.out.println("Board");
            default:
                System.out.println("yanlış harf seçimi");
        }
    }
}

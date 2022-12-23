package day_07ternary_switchStatements;

public class C10_swicht_statement {
    public static void main(String[] args) {
        /*
        kullanıcıdan gün numarasını alın ve hafta içi veya hafta sonumu oldugunu yazdırın
         */
        int gunNo=5;
        switch (gunNo){
            case 1 :
                case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta içi");
                break;
            case 6 :
            case 7 :
                System.out.println("Hafta sonu");
                break;

            default:
                System.out.println("Gecersiz gun numarasi");
        }}
}

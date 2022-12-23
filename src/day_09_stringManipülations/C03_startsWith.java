package day_09_stringManipülations;

public class C03_startsWith {
    public static void main(String[] args) {
        String str= "Java mutluluktur";
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("j")); // false
        System.out.println(str.startsWith("Java mutluluktur")); // true
        System.out.println(str.startsWith("")); // true
        System.out.println(str.contains("mutlu")); // true
        System.out.println(str.startsWith("mutlu")); // false
        System.out.println(str.startsWith("mutlu",5)); // true
        System.out.println(str.startsWith("v",2)); // true
        System.out.println("\n örnekkk");
        String sadd="hayat güzel yeis yok";
        System.out.println(sadd.length());//20
        System.out.println(sadd.length()-10);//10
        System.out.println(sadd.charAt(sadd.length()-10));// 'l'
        System.out.println(sadd.contains("güzel"));
        System.out.println(sadd.startsWith("güzel",6));
        System.out.println(sadd.startsWith("hay"));
        System.out.println(sadd.endsWith("yeis"));
        System.out.println(sadd.toUpperCase());
    }
}

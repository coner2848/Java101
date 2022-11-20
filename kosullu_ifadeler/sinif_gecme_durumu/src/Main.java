import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double matematik, fizik, turkce, kimya, muzik, ortalama, toplam=0;

        System.out.println("Matematik notunuz giriniz: ");
        matematik = input.nextDouble();
        if (matematik<=100&&matematik>=0){toplam+=matematik;}

        System.out.println("Fizik notunuz giriniz: ");
        fizik = input.nextDouble();
        if (fizik<=100&&fizik>=0){toplam+=fizik;};

        System.out.println("Turkce notunuz giriniz: ");
        turkce = input.nextDouble();
        if (turkce<=100&&turkce>=0){toplam+=turkce;}

        System.out.println("Kimya notunuz giriniz: ");
        kimya = input.nextDouble();
        if (kimya<=100&&kimya>=0){toplam+=kimya;}

        System.out.println("Muzik notunuz giriniz: ");
        muzik = input.nextDouble();
        if (muzik<=100&&muzik>=0){toplam+=muzik;}

        ortalama = toplam/5;

        if (ortalama>=55){
            System.out.println("Ortalamaniz: "+ortalama);
            System.out.println("Sinifi geçtiniz!");
        }
        else {
            System.out.println("Ortalamaniz: "+ortalama);
            System.out.println("Sinifi gecemediniz...");
        }

    }
}
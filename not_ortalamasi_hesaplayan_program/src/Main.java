import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunu Giriniz: ");
        matematik = input.nextInt();
        System.out.println("Fizik Notunu Giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunu Giriniz: ");
        kimya = input.nextInt();

        System.out.println("Turkce Notunu Giriniz: ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunu Giriniz: ");
        tarih = input.nextInt();

        System.out.println("Muzik Notunu Giriniz: ");
        muzik = input.nextInt();

        int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam / 6.0;

        System.out.println("Not Ortalamaniz: "+ ortalama);
        String sonuc = ortalama > 60 ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(sonuc);
     }
 }


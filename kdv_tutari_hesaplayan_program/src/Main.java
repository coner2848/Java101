import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double miktar, kdvDeger, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Kdv hesaplatmak istediginiz para miktari giriniz: ");
        miktar = input.nextDouble();

        kdvDeger = (miktar<1000) ? 0.18:0.08;
        kdvTutar = miktar*kdvDeger;
        kdvliTutar = miktar+kdvTutar;

        System.out.println("Girilen Para Miktari: "+miktar);
        System.out.println("Paraya Uygulanan KDV Orani: "+kdvDeger);
        System.out.println("Paraya Uygulanan KDV Miktari: "+kdvTutar);
        System.out.println("Paranin KDV'li Miktari: "+kdvliTutar);
    }
}
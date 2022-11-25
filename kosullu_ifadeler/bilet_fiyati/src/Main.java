import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, yas; int biletTuru;

        System.out.println("Mesafeyi(km) giriniz: ");
        km = input.nextDouble();
        System.out.println("Yasinizi giriniz: ");
        yas = input.nextDouble();
        System.out.println("Yolculuk tipini giriniz (1-Tek Yon 2-Gidis Donus ): ");
        biletTuru = input.nextInt();

        double toplam = km*0.10;
        double yas12_24 = toplam - (toplam*0.10);
        double yas12 = toplam - (toplam*0.50);
        double yas65 = toplam - (toplam*0.30);
        double ciftYon = 0.20;

        if (km>0 && yas>0 && (biletTuru==1 || biletTuru==2)){
            if (biletTuru==1) {
                if (yas<12) {
                    System.out.println("Toplam tutar: "+yas12);
                }
                else if (yas>=12 && yas<=24) {
                    System.out.println("Toplam tutar: "+yas12_24);
                }
                else if (yas>24 && yas <=65) {
                    System.out.println("Toplam tutar: "+toplam);
                }
                else {
                    System.out.println("Toplam tutar: "+yas65);
                }
            }
            else {
                if (yas<12) {
                    System.out.println("Toplam tutar: "+2*(yas12-(yas12*ciftYon)));
                }
                else if (yas>=12 && yas<=24) {
                    System.out.println("Toplam tutar: "+2*(yas12_24-(yas12_24*ciftYon)));
                }
                else if (yas>24 && yas <=65) {
                    System.out.println("Toplam tutar: "+2*(toplam-(toplam*ciftYon)));
                }
                else {
                    System.out.println("Toplam tutar: "+2*(yas65-(yas65*ciftYon)));
                }
            }
        }
        else {
            System.out.println("Hatali veri girdiniz!!!");
        }
    }
}
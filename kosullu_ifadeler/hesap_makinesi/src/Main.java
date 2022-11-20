import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s1,s2,sonuc;
        int secim;
        System.out.println("Birinci sayiyi giriniz: ");
        s1 = input.nextDouble();
        System.out.println("Ikinci sayiyi giriniz: ");
        s2 = input.nextDouble();

        System.out.println("Yapmak istediginiz islemi seciniz:\n1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                sonuc = s1 + s2;
                System.out.println("Sonuc: " + sonuc);
            case 2:
                sonuc = s1 - s2;
                System.out.println("Sonuc: " + sonuc);
            case 3:
                sonuc = s1 * s2;
                System.out.println("Sonuc: " + sonuc);
            case 4:
                if (s2==0){
                    System.out.println("Bolen 0 olamaz.");
                }
                else {
                    sonuc = s1 / s2;
                    System.out.println("Sonuc: " + sonuc);
                }
                break;
            default:
                System.out.println("HATALI GIRIS YAPTINIZ");
                break;
        }
    }
}
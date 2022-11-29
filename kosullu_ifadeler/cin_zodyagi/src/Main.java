import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil, sonuc;

        System.out.println("Doğum yilinizi giriniz:  ");
        yil = input.nextInt();
        sonuc = yil%12;

        if (sonuc==0) {
            System.out.println("Cin zodyagi Burcunuz: Maymun");
        }
        else if (sonuc==1) {
            System.out.println("Cin zodyagi Burcunuz: Horoz");
        }
        else if (sonuc==2) {
            System.out.println("Cin zodyagi Burcunuz: Kopek");
        }
        else if (sonuc==3) {
            System.out.println("Cin zodyagi Burcunuz: Domuz");
        }
        else if (sonuc==4) {
            System.out.println("Cin zodyagi Burcunuz: Fare");
        }
        else if (sonuc==5) {
            System.out.println("Cin zodyagi Burcunuz: Okuz");
        }
        else if (sonuc==6) {
            System.out.println("Cin zodyagi Burcunuz: Kaplan");
        }
        else if (sonuc==7) {
            System.out.println("Cin zodyagi Burcunuz: Tavsan");
        }
        else if (sonuc==8) {
            System.out.println("Cin zodyagi Burcunuz: Ejderha");
        }
        else if (sonuc==9) {
            System.out.println("Cin zodyagi Burcunuz: Yılan");
        }
        else if (sonuc==10) {
            System.out.println("Cin zodyagi Burcunuz: At");
        }
        else if (sonuc==11) {
            System.out.println("Cin zodyagi Burcunuz: Koyun");
        }
    }
}
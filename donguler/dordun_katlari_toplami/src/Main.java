import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam=0;

        do {
            System.out.println("Bir sayi giriniz (Tek sayi girdiginizde dongu biter.): ");
            sayi = input.nextInt();
            if (sayi%2==0 & sayi%4==0){
                toplam+=sayi;
            }
        }
        while (sayi%2==0);

        System.out.println("Girilen Cift Sayilardan 4'un Kati Olanlarin Toplami: "+toplam);
    }
}
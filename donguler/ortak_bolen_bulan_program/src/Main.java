import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int sayac = 0, toplam=0;

        System.out.println("0 ile girilen sayi araliginda 3 ve 4'e tam bolunen sayilar bulunacaktir.");
        System.out.println("Bir sayi giriniz:");
        sayi = input.nextInt();

        for (int i=1; i<sayi;i++) {
            if (i%3==0 && i%4==0){
                toplam+=i;
                sayac+=1;
            }
        }

        System.out.println("Girilen aralikta3 ve 4'e tam bolunen sayilarin ortalamasi : " + (toplam/sayac));

    }
}
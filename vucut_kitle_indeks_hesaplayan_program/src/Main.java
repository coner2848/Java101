import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy, kilo, index;

        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        index = kilo/(boy*boy);

        System.out.println("Vucut Kitle Indeksiniz: "+index);
    }
}
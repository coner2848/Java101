import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kenar1, kenar2, kenar3, cevre, alan,u;

        System.out.println("1. Kenar Uzunlugunu Giriniz: ");
        kenar1 = input.nextDouble();
        System.out.println("2. Kenar Uzunlugunu Giriniz: ");
        kenar2 = input.nextDouble();
        System.out.println("3. Kenar Uzunlugunu Giriniz: ");
        kenar3 = input.nextDouble();

        u=(kenar1+kenar2+kenar3)/2;
        cevre = 2*u; //ucegn cevre formulu
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)); //kenar uzunlugu verilen ucgen alan formulu

        System.out.println("Ucgenin Cevresi: "+cevre);
        System.out.println("Ucgenin Alani: "+alan);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double yol, tutar, ucret, acilisUcreti = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen Yolu Giriniz(km): ");
        yol = input.nextDouble();

        tutar = yol*2.20;
        tutar += acilisUcreti;

        ucret=(tutar<20)?20:tutar;

        System.out.println("Gidilen Km: "+yol);
        System.out.println("Odenecek Tutar: "+ucret);
    }
}
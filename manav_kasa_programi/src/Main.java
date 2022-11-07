import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double toplam,armut,elma,domates,muz,patlican;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kac Kilo ? :");
        armut = input.nextDouble();
        armut *=2.14;
        System.out.println("Elma Kac Kilo ? :");
        elma = input.nextDouble();
        elma *=3.67;
        System.out.println("Domates Kac Kilo ? :");
        domates = input.nextDouble();
        domates *=1.11;
        System.out.println("Muz Kac Kilo");
        muz = input.nextDouble();
        muz *=0.95;
        System.out.println("Patlican Kac Kilo ? :");
        patlican = input.nextDouble();
        patlican *=5.00;

        toplam = armut+elma+domates+muz+patlican;

        System.out.println("Toplam Tutar: "+toplam);
    }
}
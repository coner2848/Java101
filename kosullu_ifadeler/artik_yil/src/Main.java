import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;

        System.out.println("Lutfen yili giriniz: ");
        yil = input.nextInt();

        if (yil%100==0) {
            if (yil%400==0) {
                System.out.println(yil + " bir artik yildir !");
            }
            else {
                System.out.println(yil + " bir artik yil değildir !");
            }
        }
        else {
            if (yil%4==0) {
                System.out.println(yil + " bir artik yildir !");
            }
            else {
                System.out.println(yil + " bir artik yil değildir !");
            }
        }
    }
}
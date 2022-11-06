import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double alan, r, aci, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yaricapini Giriniz: ");
        r = input.nextDouble();
        System.out.println("Hesaplanacak Alanın Merkez Acisini Giriniz(0-360): ");
        aci = input.nextDouble();

        alan = (pi*(r*r)*aci)/360;

        System.out.println("Dairenin Yaricapi: "+r);
        System.out.println("Merkez Aci: "+aci);
        System.out.println("Daire Diliminin Alani: "+alan);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ay,gun;
        System.out.println("Dogdugunuz ayi giriniz: ");
        ay = input.nextInt();
        System.out.println("Dogdugunuz gunu giriniz");
        gun = input.nextInt();

        if (ay==1){ //ocak
            if (gun<=21){System.out.println("Oglak");}
            else if (gun>21){System.out.println("Kova");}
        }
        else if (ay==2) {  //subat
            if (gun<=19){System.out.println("Kova");}
            else if (gun>19){System.out.println("Balik");}
        }
        else if (ay==3) {  //mart
            if (gun<=20){System.out.println("Balik");}
            else if (gun>20){System.out.println("Koc");}
        }
        else if (ay==4) {  //nisan
            if (gun<=20){System.out.println("Koc");}
            else if (gun>20){System.out.println("Boga");}
        }
        else if (ay==5) {  //mayis
            if (gun<=21){System.out.println("Boga");}
            else if (gun>21){System.out.println("Ikizler");}
        }
        else if (ay==6) {  //haziran
            if (gun<=22){System.out.println("Ikizler");}
            else if (gun>22){System.out.println("Yengec");}
        }
        else if (ay==7) {  //temmuz
            if (gun<=22){System.out.println("Yengec");}
            else if (gun>22){System.out.println("Aslan");}
        }
        else if (ay==8) {  //agustos
            if (gun<=22){System.out.println("Aslan");}
            else if (gun>22){System.out.println("Basak");}
        }
        else if (ay==9) {  //eylul
            if (gun<=22){System.out.println("Basak");}
            else if (gun>22){System.out.println("Terazi");}
        }
        else if (ay==10) {  //ekim
            if (gun<=22){System.out.println("Terazi");}
            else if (gun>22){System.out.println("Akrep");}
        }
        else if (ay==11) {  //kasim
            if (gun<=21){System.out.println("Akrep");}
            else if (gun>21){System.out.println("Yay");}
        }
        else if (ay==12) {  //aralik
            if (gun<=21){System.out.println("Yay");}
            else if (gun>21){System.out.println("Oglak");}
        }
        else {
            System.out.println("Lutfen gecerli bir deger giriniz...");
        }
    }
}
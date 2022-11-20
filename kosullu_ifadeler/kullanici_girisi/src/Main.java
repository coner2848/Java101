import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String uName, password, newPassword;
        int cevap;

        System.out.println("Kullanici adinizi giriniz: ");
        uName = input.nextLine();
        System.out.println("Sifenizi giriniz: ");
        password = input.nextLine();

        if (uName.equals("ceyda")&&password.equals("test123")){
            System.out.println("Giris Yapildi...");
        }
        else{
            System.out.println("Girilen bilgiler hatalidir. Sifrenizi sifirlamak istiyorsaniz \"1\" istemiyorsaniz \"2\" yaziniz");
            cevap = input.nextInt();

            switch (cevap){
                case 1:
                    System.out.println("Yeni sifreyi giriniz: ");
                    newPassword = input.nextLine();
                    if (newPassword.equals("test123")){
                        System.out.println("Yeni sifre eski sifre ile ayni olamaz. Farkli bir deger giriniz.");
                    }
                    else {
                        System.out.println("Sifre degistirildi.");
                    }
                case 2:
                    System.out.println("Giris yapilamadi.");
            }
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.println("Girdiginiz sayiya kadar olan 4 ve 5'in katlari olan sayilar yazdirilacaktir. ");
        System.out.println("Bir sayi giriniz: ");
        sayi = input.nextInt();

        for (int i=1; i<=sayi; i*=4){
            System.out.println(i+"\n-"); //4un katlari
        }
        for (int k=1; k<=sayi; k*=5){
            System.out.println(k+"\n-"); //5in katlari
        }
    }
}
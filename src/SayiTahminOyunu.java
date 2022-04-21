import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {



        public static void main (String args []) {
            Scanner input = new Scanner(System.in);
            Random rnd = new Random();
            System.out.println("Sayı tahmin oyununa hoş geldiniz!");
            System.out.println("Lütfen 1-100 arasında bir sayı giriniz: ");
// Kullanıcıdan sayı alıyoruz
            int tahmin = input.nextInt();
// Bilgisayardan rastgele sayı alıyoruz
            int sayi = rnd.nextInt(101);
            while (tahmin != sayi) {
                if(tahmin < 0 || tahmin > 100 ) {
                    System.out.println("1 ile 100 arasında bir değer giriniz: ");
                    tahmin = input.nextInt(); }
                else if (tahmin < sayi) {
                    System.out.println("Daha büyük bir sayı giriniz: ");
                    tahmin = input.nextInt(); }
                else{
                    System.out.println("Daha küçük bir sayı giriniz: ");
                    tahmin = input.nextInt();}
            }
// Eğer sayımız ve tahmin birbirine eşitse while döngüsüne girmez
// ve print komutunu yazdırırız
            System.out.println("Tebrikler, kazandınız!"); }
    }

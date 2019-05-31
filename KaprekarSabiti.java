import java.util.InputMismatchException;
import java.util.Scanner;

public class KaprekarSabiti {

    public static void kucuktenBuyuge(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i; j < dizi.length; j++) {
                if (dizi[j] < dizi[i]) {
                    int temp = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = temp;
                }
            }
        }
    }

    public static void buyuktenKucuge(int[] dizi) {
        kucuktenBuyuge(dizi);
        for (int i = 0; i < dizi.length / 2; i++) {
            int temp = dizi[i];
            dizi[i] = dizi[dizi.length - i - 1];
            dizi[dizi.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        try {
            // Kullanıcıdan sayı alalım
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz : ");
            int sayi = input.nextInt();
            
            // Gerekli tanımlamaları yapalım
            int[] rakamlar = new int[4];
            int[] a = new int[rakamlar.length];
            int[] b = new int[rakamlar.length];
            // kb : küçükten büyüğe
            StringBuilder kb = new StringBuilder();
            // bk : büyükten küçüğe
            StringBuilder bk = new StringBuilder();
            
            // Kullanıcıdan alınan sayımız, sabitimiz olan 6174'e eşit olana kadar aşağıdaki işlemler uygulansın
            while (sayi != 6174) {
                // 1000 < sayi < 9999 olmalı, kontrol edelim
                if (1000 < sayi && sayi < 9999) {

                    // kb ve bk değişkenlerimizi temizleyelim
                    // Temizlemediğimiz zaman neler olduğunu merak ediyorsanız aşağıdaki for döngüsünü silip göz atınız :D
                    for (int i = 0; i < rakamlar.length; i++) {
                        kb.replace(0, rakamlar.length, "");
                        bk.replace(0, rakamlar.length, "");
                    }

                    // Sayıyı basamaklarına ayırıp rakamlar dizisine atalım
                    for (int i = 0; i < rakamlar.length; i++) {
                        rakamlar[i] = sayi % 10;
                        sayi = (sayi - rakamlar[i]) / 10;
                        if (sayi == 0)
                            break;
                    }

                    // Küçükten büyüğe sıralayalım
                    kucuktenBuyuge(rakamlar);
                    // Küçükten büyüğe sıralanmış rakamları a dizisine koplayalım
                    System.arraycopy(rakamlar, 0, a, 0, rakamlar.length);

                    // Büyükten küçüğe sıralayalım
                    buyuktenKucuge(rakamlar);
                    // Büyükten küçüğe sıralanmış rakamları b dizisine koplayalım
                    System.arraycopy(rakamlar, 0, b, 0, rakamlar.length);

                    // a ve b dizilerine kopyaladığımız rakamları kb ve bk üzerinde birleştirelim
                    for (int j = 0; j < rakamlar.length; j++) {
                        kb.append(a[j]);
                        bk.append(b[j]);
                    }

                    // kb ve bk değişkenlerini integera çevirip büyük olanı küçük olandan çıkaralım
                    sayi = Integer.parseInt(bk.toString()) - Integer.parseInt(kb.toString());
                    // Çıkarma işlemini ekrana yazdıralım
                    System.out.printf("%d - %d = %d\n", Integer.parseInt(bk.toString()), Integer.parseInt(kb.toString()), sayi);
                } 
                // Hataları kontrol edelim
                else {
                    System.err.println("1000'den büyük, 9999'dan küçük bir sayı giriniz!");
                    break;
                }
            } // while bitişi
        } catch (InputMismatchException ime) {
            System.err.println("1000'den büyük, 9999'dan küçük bir sayı giriniz! " + ime.getMessage());
        } catch (Exception e) {
            System.err.println("1000'den büyük, 9999'dan küçük bir sayı giriniz! " + e.getMessage());
        }

    }
}

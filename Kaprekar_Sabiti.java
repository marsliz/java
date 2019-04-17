import java.util.InputMismatchException;
import java.util.Scanner;

public class Kaprekar_Sabiti {

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
            // Kullan�c�dan say� alal�m
            Scanner input = new Scanner(System.in);
            System.out.print("Bir say� giriniz : ");
            int sayi = input.nextInt();
            
            // Gerekli tan�mlamalar� yapal�m
            int[] rakamlar = new int[4];
            int[] a = new int[rakamlar.length];
            int[] b = new int[rakamlar.length];
            // kb : k���kten b�y��e
            StringBuilder kb = new StringBuilder();
            // bk : b�y�kten k����e
            StringBuilder bk = new StringBuilder();
            
            // Kullan�c�dan al�nan say�m�z, sabitimiz olan 6174'e e�it olana kadar a�a��daki i�lemler uygulans�n
            while (sayi != 6174) {
                // 1000 < sayi < 9999 olmal�, kontrol edelim
                if (1000 < sayi && sayi < 9999) {

                    // kb ve bk de�i�kenlerimizi temizleyelim
                    // Temizlemedi�imiz zaman neler oldu�unu merak ediyorsan�z a�a��daki for d�ng�s�n� silip g�z at�n�z :D
                    for (int i = 0; i < rakamlar.length; i++) {
                        kb.replace(0, rakamlar.length, "");
                        bk.replace(0, rakamlar.length, "");
                    }

                    // Say�y� basamaklar�na ay�r�p rakamlar dizisine atal�m
                    for (int i = 0; i < rakamlar.length; i++) {
                        rakamlar[i] = sayi % 10;
                        sayi = (sayi - rakamlar[i]) / 10;
                        if (sayi == 0)
                            break;
                    }

                    // K���kten b�y��e s�ralayal�m
                    kucuktenBuyuge(rakamlar);
                    // K���kten b�y��e s�ralanm�� rakamlar� a dizisine koplayal�m
                    System.arraycopy(rakamlar, 0, a, 0, rakamlar.length);

                    // B�y�kten k����e s�ralayal�m
                    buyuktenKucuge(rakamlar);
                    // B�y�kten k����e s�ralanm�� rakamlar� b dizisine koplayal�m
                    System.arraycopy(rakamlar, 0, b, 0, rakamlar.length);

                    // a ve b dizilerine kopyalad���m�z rakamlar� kb ve bk �zerinde birle�tirelim
                    for (int j = 0; j < rakamlar.length; j++) {
                        kb.append(a[j]);
                        bk.append(b[j]);
                    }

                    // kb ve bk de�i�kenlerini integera �evirip b�y�k olan� k���k olandan ��karal�m
                    sayi = Integer.parseInt(bk.toString()) - Integer.parseInt(kb.toString());
                    // ��karma i�lemini ekrana yazd�ral�m
                    System.out.printf("%d - %d = %d\n", Integer.parseInt(bk.toString()), Integer.parseInt(kb.toString()), sayi);
                } 
                // Hatalar� kontrol edelim
                else {
                    System.err.println("1000'den b�y�k, 9999'dan k���k bir say� giriniz!");
                    break;
                }
            } // while biti�i
        } catch (InputMismatchException ime) {
            System.err.println("1000'den b�y�k, 9999'dan k���k bir say� giriniz! " + ime.getMessage());
        } catch (Exception e) {
            System.err.println("1000'den b�y�k, 9999'dan k���k bir say� giriniz! " + e.getMessage());
        }

    }
}
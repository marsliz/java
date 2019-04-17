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
            // Kullanýcýdan sayý alalým
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayý giriniz : ");
            int sayi = input.nextInt();
            
            // Gerekli tanýmlamalarý yapalým
            int[] rakamlar = new int[4];
            int[] a = new int[rakamlar.length];
            int[] b = new int[rakamlar.length];
            // kb : küçükten büyüðe
            StringBuilder kb = new StringBuilder();
            // bk : büyükten küçüðe
            StringBuilder bk = new StringBuilder();
            
            // Kullanýcýdan alýnan sayýmýz, sabitimiz olan 6174'e eþit olana kadar aþaðýdaki iþlemler uygulansýn
            while (sayi != 6174) {
                // 1000 < sayi < 9999 olmalý, kontrol edelim
                if (1000 < sayi && sayi < 9999) {

                    // kb ve bk deðiþkenlerimizi temizleyelim
                    // Temizlemediðimiz zaman neler olduðunu merak ediyorsanýz aþaðýdaki for döngüsünü silip göz atýnýz :D
                    for (int i = 0; i < rakamlar.length; i++) {
                        kb.replace(0, rakamlar.length, "");
                        bk.replace(0, rakamlar.length, "");
                    }

                    // Sayýyý basamaklarýna ayýrýp rakamlar dizisine atalým
                    for (int i = 0; i < rakamlar.length; i++) {
                        rakamlar[i] = sayi % 10;
                        sayi = (sayi - rakamlar[i]) / 10;
                        if (sayi == 0)
                            break;
                    }

                    // Küçükten büyüðe sýralayalým
                    kucuktenBuyuge(rakamlar);
                    // Küçükten büyüðe sýralanmýþ rakamlarý a dizisine koplayalým
                    System.arraycopy(rakamlar, 0, a, 0, rakamlar.length);

                    // Büyükten küçüðe sýralayalým
                    buyuktenKucuge(rakamlar);
                    // Büyükten küçüðe sýralanmýþ rakamlarý b dizisine koplayalým
                    System.arraycopy(rakamlar, 0, b, 0, rakamlar.length);

                    // a ve b dizilerine kopyaladýðýmýz rakamlarý kb ve bk üzerinde birleþtirelim
                    for (int j = 0; j < rakamlar.length; j++) {
                        kb.append(a[j]);
                        bk.append(b[j]);
                    }

                    // kb ve bk deðiþkenlerini integera çevirip büyük olaný küçük olandan çýkaralým
                    sayi = Integer.parseInt(bk.toString()) - Integer.parseInt(kb.toString());
                    // Çýkarma iþlemini ekrana yazdýralým
                    System.out.printf("%d - %d = %d\n", Integer.parseInt(bk.toString()), Integer.parseInt(kb.toString()), sayi);
                } 
                // Hatalarý kontrol edelim
                else {
                    System.err.println("1000'den büyük, 9999'dan küçük bir sayý giriniz!");
                    break;
                }
            } // while bitiþi
        } catch (InputMismatchException ime) {
            System.err.println("1000'den büyük, 9999'dan küçük bir sayý giriniz! " + ime.getMessage());
        } catch (Exception e) {
            System.err.println("1000'den büyük, 9999'dan küçük bir sayý giriniz! " + e.getMessage());
        }

    }
}
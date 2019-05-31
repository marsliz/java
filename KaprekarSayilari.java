import java.util.InputMismatchException;
import java.util.Scanner;

public class KaprekarSayilari {

    public static int kacBasamakli(int sayi) {
        int kalan, basamak = 0;
        while (sayi != 0) {
            kalan = sayi % 10;
            sayi = (sayi - kalan) / 10;
            basamak++;
        }
        return basamak;
    }

    public static boolean kaprekarSayisi(int sayi) {
        int karesi = (int)Math.pow(sayi, 2);
        
        if (karesi >= Integer.MAX_VALUE || sayi < 0) {
            System.out.println("Hesaplanabilen aralığın dışına çıktınız!");
            System.exit(0);
        } else {
                String s = String.valueOf(karesi);
                int kbs = kacBasamakli(karesi); // kbs : karesinin basamak sayısı
                int sol = Integer.parseInt(s.substring(0, (kbs / 2)));
                int sag = Integer.parseInt(s.substring((kbs / 2), kbs));
                System.out.printf("\n   %d x %d = %d\n   %d + %d = %d\n\n", sayi, sayi, karesi, sol, sag, (sol + sag));
                return sayi == (sol + sag);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        try {
            if (sayi == 1) 
                System.out.println(sayi + " kaprekar sayısıdır.");
            else if (kaprekarSayisi(sayi))
                System.out.println(sayi + " bir kaprekar sayısıdır.");
            else 
                System.out.println(sayi + " kaprekar sayısı değildir.");
        } catch (InputMismatchException ime) {
            System.err.println("Hatalı giriş yaptınız!\nHata : " + ime);
        } catch (NumberFormatException nfe) {
            if (sayi == 2)
                System.out.println("\n   2 x 2 = 4\nSayının karesi basamaklarına ayrılamıyor.\n\n2 bir kaprekar sayısı değildir.");
            else if (sayi == 3)
                System.out.println("\n   3 x 3 = 9\nSayının karesi basamaklarına ayrılamıyor.\n\n3 bir kaprekar sayısı değildir.");
        } catch (Exception e) {
            System.err.println("Hata! " + e);
        }
        
    }
}

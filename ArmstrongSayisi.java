import java.util.Scanner;

public class ArmstrongSayisi {
    
    public static int kacBasamakli(int sayi){
        int basamak  = 0;
        while (sayi != 0) {
            int kalan = sayi % 10;
            sayi = (sayi - kalan) / 10;
            basamak++;
        }
        return basamak;
    }
    
    public static boolean armstrongSayisi(int sayi){
        int basamak, toplam = 0, kuvvet = kacBasamakli(sayi), temp = sayi;
        
        while (temp != 0) {
            basamak = temp % 10;
            temp = (temp - basamak) / 10;
            toplam += Math.pow(basamak, kuvvet);
            System.out.printf("  %d ^ %d = %d\n",basamak,kuvvet,(int)Math.pow(basamak, kuvvet));
        }
        
        // alternatif olarak aşağıdaki çözümde kullanılabilir
        String sayiStr = sayi+"";
        int basamak1 = Integer.parseInt(String.valueOf(sayiStr.charAt(0)));
        int basamak2 = Integer.parseInt(String.valueOf(sayiStr.charAt(1)));
        int basamak3 = Integer.parseInt(String.valueOf(sayiStr.charAt(2)));
        System.out.println((int)Math.pow(basamak1, kuvvet)+" + "+(int)Math.pow(basamak2, kuvvet)+" + "+(int)Math.pow(basamak3, kuvvet)+" = "+toplam);
        
        return sayi == toplam;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        if (armstrongSayisi(sayi))
            System.out.println(sayi + " bir armstrong sayısıdır.");
        else 
            System.out.println(sayi + " armstrong sayısı değildir.");
    }
}
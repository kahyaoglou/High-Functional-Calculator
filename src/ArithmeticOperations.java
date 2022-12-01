import java.sql.SQLOutput;
import java.util.Scanner;
public class ArithmeticOperations {
    double toplam, fark, carpim, bolum;
    Scanner input = new Scanner(System.in);
    public int showMenu(){
        System.out.println("\n1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("0- Çıkış");
        System.out.print("Yapılacak Aritmetik İşlemi Seçiniz: ");
        return input.nextInt();
    }

    public void sum(){
        System.out.print("\nLütfen İlk Sayıyı Giriniz: ");
        double firstTop = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        double secondTop = input.nextDouble();
        toplam = (firstTop + secondTop);
        System.out.println("Sonuç: " + toplam +"\n");
    }

    public void minus(){
        System.out.print("\nLütfen İlk Sayıyı Giriniz: ");
        double firstCik = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        double secondCik = input.nextDouble();
        fark = firstCik-secondCik;
        System.out.println("Sonuç: " + fark +"\n");
    }

    public void times() {
        System.out.print("\nLütfen İlk Sayıyı Giriniz: ");
        double firstCar = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        double secondCar = input.nextDouble();
        carpim = firstCar * secondCar;
        System.out.println("Sonuç: " + carpim +"\n");
    }

    public void divider(){
        System.out.print("\nLütfen İlk Sayıyı Giriniz: ");
        double firstBol = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        double secondBol = input.nextDouble();
        if(firstBol == 0 && secondBol == 0)
        {
            System.out.println("\nSonuç: 0/0 belirsizliği!");
            System.out.println("Bölen ve Bölünen '0' olmamalıdır.\n");
        }
        else if(secondBol == 0)
        {
            System.out.println("\nSonuç: Tanımsız!");
            System.out.println("Bölen '0' olmamalıdır.\n");
        }
        else{
            bolum = firstBol / secondBol;
            System.out.println("Sonuç: " + bolum +"\n");
        }
    }
}
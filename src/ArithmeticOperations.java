import java.util.Scanner;
public class ArithmeticOperations {
    double toplam, fark, carpim, bolum;
    Scanner input = new Scanner(System.in);
    public int ArithmeticMenu(){
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("0- Çıkış");
        System.out.print("Yapılacak Aritmetik İşlemi Seçiniz: ");
        return input.nextInt();
    }

    public void Toplam(){
        System.out.print("Lütfen İlk Sayıyı Giriniz: ");
        double firstTop = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        double secondTop = input.nextDouble();
        toplam = (firstTop + secondTop);
        System.out.println("Sonuç: " + toplam);
        System.out.println();
    }

    public void Fark(){
        System.out.print("Lütfen İlk Sayıyı Giriniz: ");
        double firstCik = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        double secondCik = input.nextDouble();
        fark = firstCik-secondCik;
        System.out.println("Sonuç: " + fark);
        System.out.println();
    }

    public void Carpim() {
        System.out.print("Lütfen İlk Sayıyı Giriniz: ");
        double firstCar = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        double secondCar = input.nextDouble();
        carpim = firstCar * secondCar;
        System.out.println("Sonuç: " + carpim);
        System.out.println();
    }

    public void Bolum(){
        System.out.print("Lütfen İlk Sayıyı Giriniz: ");
        double firstBol = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        double secondBol = input.nextDouble();
        bolum = firstBol / secondBol;
        System.out.println("Sonuç: " + bolum);
        System.out.println();
    }
}

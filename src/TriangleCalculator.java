import java.util.Scanner;
public class TriangleCalculator {
    Scanner input = new Scanner(System.in);
    double alan;
    int u, r, yukseklik, kenar1, kenar2, kenar3;

    public int TriangleCalculatorMenu(){
        System.out.println("Yapılacak İşlemi Seçiniz: ");
        System.out.println("1- Eşkenar Üçgenin Alanı");
        System.out.println("2- Bir Kenarı ve Bu Kenarın Yükseklik Ölçüsü Bilinen Üçgenin Alanı");
        System.out.println("3- Üç Kenarının Uzunluğu Bilinen Üçgenin Alanı");
        System.out.println("4- İç Teğet Çemberinin Yarıçapı ve Çevresinin Uzunluğu Bilinen Üçgenin Alanı");
        System.out.println("5- Çevrel Çemberinin Yarıçapının Uzunluğu Bilinen Üçgenin Alanı");
        int secim = input.nextInt();
        return secim;
    }

    public void EquilateralTriangleArea(){
        System.out.print("Bir Kenarının Uzunluğunu Giriniz: ");
        kenar1 = input.nextInt();
        alan = (kenar1 * kenar1 * Math.sqrt(3)) / 4;
        System.out.println("Alan = " + alan);
    }

    public void HeightAreaCalculator(){
        System.out.print("Bir Kenarının Uzunluğunu Giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("Bu Kenara Ait Yüksekliği Giriniz: ");
        yukseklik = input.nextInt();
        alan = (kenar1 * yukseklik) / 2;
        System.out.println("Alan = " +alan);
    }

    public void HeronAreaCalculator(){
        System.out.print("İlk Kenarın Uzunluğunu Giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz: ");
        kenar3 = input.nextInt();

        u = (kenar1+kenar2+kenar3) / 2;
        alan = Math.sqrt((u*(u-kenar1)*(u-kenar2)*(u-kenar3)));
        System.out.println("Alan: "+alan);
        if (alan <= 0)
            System.out.println("Bu kenar ölçüleriyle üçgen oluşturulamaz!");
    }

    public void TangentCircleAreaCalculator(){
        System.out.print("İlk Kenarın Uzunluğunu Giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz: ");
        kenar3 = input.nextInt();
        System.out.print("İç Teğet Çemberi Yarı Çapını Giriniz: ");
        r  = input.nextInt();
        u = kenar1/2 + kenar2/2 + kenar3/2;
        alan = u * r;
        System.out.println("Alan = " +alan);
    }

    public void CircumCircleAreaCalculator(){
        System.out.print("İlk Kenarın Uzunluğunu Giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz: ");
        kenar3 = input.nextInt();
        System.out.print("Çevrel Çemberin Yarıçapını Giriniz: ");
        r = input.nextInt();

        alan = (kenar1 * kenar2 * kenar3) / (r*4);
        System.out.println("Alan = " +alan);
    }
}

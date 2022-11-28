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
        if (kenar1 > 0) {
            alan = (kenar1 * kenar1 * Math.sqrt(3)) / 4;
            System.out.println("Alan = " + alan);
        }
        else{
            System.out.print("Kenar Uzunluğu 0 veya 0'dan Küçük Olamaz!");
        }

    }

    public void HeightAreaCalculator(){
        System.out.print("Bir Kenarının Uzunluğunu Giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("Bu Kenara Ait Yüksekliği Giriniz: ");
        yukseklik = input.nextInt();
        if(kenar1 > 0 || yukseklik > 0){
            alan = (kenar1 * yukseklik) / 2;
            System.out.println("Alan = " +alan);
        }
        else{
            System.out.print("Kenar Uzunluğu veya Yükseklik, 0 veya 0'dan Küçük Olamaz!");
        }
    }

    public void HeronAreaCalculator(){
        System.out.print("İlk Kenarın Uzunluğunu Giriniz: ");
        kenar1 = input.nextInt();
        System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
        kenar2 = input.nextInt();
        System.out.print("Üçüncü Kenarın Uzunluğunu Giriniz: ");
        kenar3 = input.nextInt();

        if (kenar1 > 0 || kenar2 > 0 || kenar3 > 0) {
            u = (kenar1+kenar2+kenar3) / 2;
            alan = Math.sqrt((u*(u-kenar1)*(u-kenar2)*(u-kenar3)));
            System.out.println("Alan: "+alan);
        }
        else{
            System.out.print("Kenar Uzunluğu 0 veya 0'dan Küçük Olamaz!");
        }
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
        if (kenar1 > 0 || kenar2 > 0 || kenar3 > 0 || r > 0){
            u = (kenar1 + kenar2 + kenar3)/2;
            alan = u * r;
            System.out.println("Alan = " +alan);
        }
        else{
            System.out.print("Kenar Uzunluğu veya Yarı Çap, 0 veya 0'dan Küçük Olamaz!");
        }

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

        if (kenar1 > 0 || kenar2 > 0 || kenar3 > 0 || r > 0){
            alan = (kenar1 * kenar2 * kenar3) / (4 * r);
            System.out.println("Alan = " +alan);
        }
        else{
            System.out.print("Kenar Uzunluğu veya Yarı Çap, 0 veya 0'dan Küçük Olamaz!");
        }
    }
}

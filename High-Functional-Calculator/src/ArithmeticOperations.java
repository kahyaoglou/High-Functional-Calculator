import java.text.DecimalFormat;
public class ArithmeticOperations {
    double toplam, fark, carpim, bolum;

    public void Toplam(double a, double b){
        toplam = a+b;
        System.out.println("Sonuç: " + toplam);
    }

    public void Fark(double a, double b){
        fark = a-b;
        System.out.println("Sonuç: " + fark);
    }

    public void Carpim(double a, double b) {
        carpim = a*b;
        System.out.println("Sonuç: " + carpim);
    }

    public void Bolum(double a, double b){
        bolum = a/b;
        System.out.println("Sonuc: " + bolum);
    }
}

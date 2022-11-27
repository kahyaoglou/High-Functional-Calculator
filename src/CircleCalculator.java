import java.util.Scanner;
public class CircleCalculator {
    Scanner input = new Scanner(System.in);
    double alan, cevre, aciAlan;
    int r, a;
    final double pi = 3.14;

    public int circleCalculatorMenu(){
        System.out.println("Hangi İşlemi Yapalım?");
        System.out.println("- Daire Çevre(1)");
        System.out.println("- Daire Alan(2)");
        System.out.print("- Merkez Açılı Dairede Alan(3): ");
        int secim = input.nextInt();
        return secim;
    }
    public void circumferenceCalculator(){
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        cevre = 2 * pi * r;
        System.out.println("Çevre: " + cevre);
    }

    public void areaCalculator(){
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        alan = pi * r * r;
        System.out.println("Alan: " + alan);
    }

    public void centralAngleAreaCalculator(){
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        a = input.nextInt();
        if (a >=0 && a <= 360){
            aciAlan = (pi * (r * r) * a)/360;
            System.out.println("Merkez Açılı Alan: " + aciAlan);
        }
        else{
            System.out.println("Merkez açı 0 ile 360 derece arasında olmalıdır!");
        }
    }
}

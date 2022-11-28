import java.util.Scanner;
public class CircleCalculator {
    Scanner input = new Scanner(System.in);
    double alan, cevre, aciAlan;
    int r, a;
    final double pi = 3.14;

    public int circleCalculatorMenu(){
        System.out.println("- Çıkış(0):");
        System.out.println("- Daire Çevre(1)");
        System.out.println("- Daire Alan(2)");
        System.out.println("- Merkez Açılı Dairede Alan(3)");
        System.out.print("Hangi İşlemi Yapalım?: ");
        return input.nextInt();
    }
    public void circumferenceCalculator(){
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        cevre = 2 * pi * r;
        System.out.println("Çevre: " + cevre);
        System.out.println();
    }

    public void areaCalculator(){
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        alan = pi * r * r;
        System.out.println("Alan: " + alan);
        System.out.println();
    }

    public void centralAngleAreaCalculator(){
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        a = input.nextInt();
        if (a >=0 && a <= 360){
            aciAlan = (pi * (r * r) * a)/360;
            System.out.println("Merkez Açılı Alan: " + aciAlan);
            System.out.println();
        }
        else{
            System.out.println("Merkez açı 0 ile 360 derece arasında olmalıdır!");
            System.out.println();
        }
    }
}

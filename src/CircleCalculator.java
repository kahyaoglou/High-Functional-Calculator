import java.util.Scanner;
public class CircleCalculator {
    Scanner input = new Scanner(System.in);
    double alan, cevre, aciAlan;
    int r, a;
    final double pi = 3.14;

    public int showMenu(){
        System.out.println("\n- Daire Çevre(1)");
        System.out.println("- Daire Alan(2)");
        System.out.println("- Merkez Açılı Dairede Alan(3)");
        System.out.println("- Çıkış(0)");
        System.out.print("Yapılacak İşlemi Seçiniz: ");
        return input.nextInt();
    }
    public void circumferenceCalculator(){
        System.out.print("\nDairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        cevre = 2 * pi * r;
        System.out.println("Çevre: " + cevre +"\n");
    }

    public void areaCalculator(){
        System.out.print("\nDairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        alan = pi * r * r;
        System.out.println("Alan: " + alan +"\n");
    }

    public void centralAngleAreaCalculator(){
        System.out.print("\nDairenin Yarıçapını Giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        a = input.nextInt();
        if (a >=0 && a <= 360){
            aciAlan = (pi * (r * r) * a)/360;
            System.out.println("Merkez Açılı Alan: " + aciAlan +"\n");
        }
        else{
            System.out.println("Merkez açı 0 ile 360 derece arasında olmalıdır! \n");
        }
    }
}

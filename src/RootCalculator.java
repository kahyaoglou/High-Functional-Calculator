import java.util.Scanner;
public class RootCalculator {
    Scanner input = new Scanner(System.in);
    double finalRoot;
    public void RootCalculator() {
        System.out.print("Kök Değerini Giriniz: ");
        double root = input.nextDouble();
        System.out.print("Kaçıncı Dereceden Kök Alınacak?: ");
        double degree = input.nextDouble();
        finalRoot = Math.pow(root, 1.0 / degree);
        System.out.println("Sonuç: " + finalRoot);
    }
}

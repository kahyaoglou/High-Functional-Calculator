import java.util.Scanner;
public class ExponentCalculator {
    Scanner input = new Scanner(System.in);
    float finalExponent=1;
    public void exponent()
    {
        System.out.print("\nTaban Değerini Giriniz: ");
        double base = input.nextDouble();
        System.out.print("Üs Değerini Giriniz: ");
        double power = input.nextDouble();

        for (int i = 1; i <= power; i++)
        {
            finalExponent *= base;
        }

        System.out.println("Sonuc: " + finalExponent);
        System.out.println();
    }
}

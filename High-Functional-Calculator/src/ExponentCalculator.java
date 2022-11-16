public class ExponentCalculator {
    float finalExponent=1;
    public void exponent(double base, double power)
    {
        for (int i = 1; i <= power; i++)
        {
            finalExponent *= base;
        }

        System.out.println("Sonuc: " + finalExponent);
        System.out.println();
    }
}

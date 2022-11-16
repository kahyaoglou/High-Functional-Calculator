public class FactorialCalculator {
    int factorial = 1;
    public void Factorial(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Sonuç: " + factorial);
    }

}

import java.util.Scanner;
public class FactorialCalculator {
    Scanner input = new Scanner(System.in);
    int factorial = 1;
    public void Factorial()
    {
        System.out.print("Hangi Sayının Faktöriyelini Alalım?:  ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Sonuç: " + factorial);
    }

}

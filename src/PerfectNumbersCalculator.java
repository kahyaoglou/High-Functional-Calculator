import java.util.Scanner;
public class PerfectNumbersCalculator {
    Scanner input = new Scanner(System.in);
    int perfectNum, i=1, total = 0;

    public void perfectNumberCalculate(){
        System.out.print("\nSayıyı Giriniz: ");
        perfectNum = input.nextInt();

        do {
            if (perfectNum % i == 0)
            {
                if (i != perfectNum)
                {
                    total += i;
                }
            }
            i++;
        }
        while(i <= perfectNum);
        if (total == perfectNum)
        {
            System.out.println(perfectNum + " Mükemmel Sayıdır!\n");
        }
        else {
            System.out.println(perfectNum + " Mükemmel Sayı Değildir.\n");
        }
    }
}

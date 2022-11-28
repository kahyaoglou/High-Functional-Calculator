import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCalculator {
    Scanner input = new Scanner(System.in);
    int control;
    List<Integer> list = new ArrayList<>();
    public void PrimeNumberCalculate(){
        System.out.print("\nSayıyı Giriniz: ");
        int primeNum = input.nextInt();
        for(int i=2; i<= primeNum; i++){
            control = 0;
            for (int j=2; j<i; j++)
            {
                if(i % j == 0)
                {
                    control = i;
                    break;
                }
            }
            if(control == 0)
            {

                list.add(i);

            }
        }
        if(list.contains(primeNum))
        {
            System.out.println(primeNum + " asal sayıdır.\n");
        }
        else{
            System.out.println(primeNum + " asal sayı değildir.\n");
        }
    }
}

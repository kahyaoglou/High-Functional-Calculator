import java.util.Scanner;
public class ArmstrongCalculator {
    Scanner input = new Scanner(System.in);
    public void ArmstrongCalculate(){
        int basamakNumber = 0;
        int armstrongNumber = 0;
        int tempNumber = armstrongNumber;
        int basamakValue;
        int result = 0;
        int basamakPower;


        System.out.print("Sayıyı Giriniz: ");
        armstrongNumber = input.nextInt();

        while(tempNumber != 0)
        {
            tempNumber = tempNumber / 10;
            basamakNumber++;
        }

        tempNumber = armstrongNumber;

        while (tempNumber != 0)
        {
            basamakValue = tempNumber % 10;
            basamakPower = 1;

            for (int i = 1; i <= basamakNumber; i++)
            {
                basamakPower = basamakPower * basamakValue;
            }
            result = result + basamakPower;
            tempNumber = tempNumber / 10;
        }

        if (result == armstrongNumber)
        {
            System.out.println(armstrongNumber + " sayısı bir Armstrong sayıdır.");
            System.out.println();
        }
        else
        {
            System.out.println(armstrongNumber + " sayısı bir Armstrong sayı değildir.");
            System.out.println();
        }
    }

}

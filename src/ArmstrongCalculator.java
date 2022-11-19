public class ArmstrongCalculator {
    public void ArmstrongCalculate(int number){
        int basamakNumber = 0;
        int tempNumber = number;
        int basamakValue;
        int result = 0;
        int basamakPower;

        while(tempNumber != 0)
        {
            tempNumber = tempNumber / 10;
            basamakNumber++;
        }

        tempNumber = number;

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

        if (result == number)
        {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        }
        else
        {
            System.out.println(number + " sayısı bir Armstrong sayı değildir.");
        }
    }

}

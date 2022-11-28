import java.util.Scanner;
public class CombinationCalculator {
    Scanner input = new Scanner(System.in);
    int combination, finalFactorial = 1;
    int groupFactorial = 1, littleGroupFactorial=1;

    public void Combination()
    {
        System.out.print("\nKümemiz Kaç Elemanlı?: ");
        int group = input.nextInt();
        System.out.print("Oluşacak Küme Kaç Elemanlı Olsun?: ");
        int littleGroup = input.nextInt();

        for(int i = 1; i <= group; i++){
            groupFactorial = groupFactorial*i;
        }
        for(int j = 1; j <= littleGroup; j++)
        {
            littleGroupFactorial = littleGroupFactorial*j;
        }
        for(int k = 1; k <= group-littleGroup; k++){
            finalFactorial = finalFactorial*k;
        }
        combination = groupFactorial / (littleGroupFactorial*finalFactorial);
        System.out.println("Sonuc: " + combination +"\n");
    }
}

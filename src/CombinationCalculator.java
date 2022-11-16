public class CombinationCalculator {
    int combination, finalFactorial = 1;
    int groupFactorial = 1, littleGroupFactorial=1;
    public void Combination(int group, int littleGroup)
    {
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
        System.out.println("Sonuc: " + combination);
    }
}

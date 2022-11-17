public class GcdLcmCalculator {
    public void GCDCalculator(int num1, int num2) {
        int i = 1, gcd = 1;
        while(i<=num1){
            if ((num1 % i == 0) && (num2 % i ==0)){
                gcd = i;
            }
            i++;
        }
        System.out.println();
        System.out.println(num1 + " ve " + num2 + "'nin EBOB'u: " + gcd);
    }

    public void LCMCalculator(int num1, int num2){
        int i = 1, lcm = 1;

        while(i <= num1*num2){
            if((i % num1 == 0) && (i % num2 == 0)){
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println();
        System.out.println(num1 + " ve " + num2 + "'nin EKOK'u: " + lcm);
    }
}

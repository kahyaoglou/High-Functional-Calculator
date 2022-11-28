import java.util.Scanner;
public class GcdLcmCalculator {
    Scanner input = new Scanner(System.in);
    int num1, num2;
    public int GcdLcmMenu(){
        System.out.println("EBOB(1) / EKOK(2) / Çıkış(0)");
        System.out.print("Hangi Hesaplamayı Yapalım?: ");
        return input.nextInt();

    }
    public void GCDCalculator() {
        System.out.print("İlk Sayıyı Giriniz: ");
        num1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        num2 = input.nextInt();
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

    public void LCMCalculator(){
        System.out.print("İlk Sayıyı Giriniz: ");
        num1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        num2 = input.nextInt();
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

import java.sql.SQLOutput;
import java.util.Scanner;
public class ArithmeticOperations {
    double toplam, fark, carpim, bolum, firstNum, secondNum;
    Scanner input = new Scanner(System.in);
    public int showMenu(){
        System.out.println("\n1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("0- Çıkış");
        System.out.print("Yapılacak Aritmetik İşlemi Seçiniz: ");
        return input.nextInt();
    }

    public void setFirstAndSecondNum(){
        System.out.print("\nLütfen İlk Sayıyı Giriniz: ");
        this.firstNum = input.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        this.secondNum = input.nextDouble();
    }

    public void emptyFirstAndSecondNum(){
        this.firstNum = 0;
        this.secondNum = 0;
    }

    public void sum(){
        setFirstAndSecondNum();
        toplam = (firstNum + secondNum);
        System.out.println("Sonuç: " + toplam +"\n");
        emptyFirstAndSecondNum();
    }

    public void minus(){
        setFirstAndSecondNum();
        fark = firstNum - secondNum;
        System.out.println("Sonuç: " + fark +"\n");
        emptyFirstAndSecondNum();
    }

    public void times() {
        setFirstAndSecondNum();
        carpim = firstNum * secondNum;
        System.out.println("Sonuç: " + carpim +"\n");
        emptyFirstAndSecondNum();
    }

    public void divider(){
        setFirstAndSecondNum();
        if(firstNum == 0 && secondNum == 0)
        {
            System.out.println("\nSonuç: 0/0 belirsizliği!");
            System.out.println("Bölen ve Bölünen '0' olmamalıdır.\n");
        }
        else if(secondNum == 0)
        {
            System.out.println("\nSonuç: Tanımsız!");
            System.out.println("Bölen '0' olmamalıdır.\n");
        }
        else{
            bolum = firstNum / secondNum;
            System.out.println("Sonuç: " + bolum +"\n");
        }
        emptyFirstAndSecondNum();
    }
}
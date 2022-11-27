import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        int mainAnswer = 0;
        do{
            MainMenu main = new MainMenu();
            main.mainMenuChoose();
            secim = input.nextInt();
            LoopCounter loopCounter = new LoopCounter();

            switch(secim){
                case 1:
                    int secim2;
                    ArithmeticOperations menu = new ArithmeticOperations();
                    ArithmeticOperations result = new ArithmeticOperations();
                    secim2 = menu.ArithmeticMenu();

                    do {
                        switch(secim2) {
                            case 1:
                                result.Toplam();
                                break;
                            case 2:
                                result.Fark();
                                break;
                            case 3:
                                result.Carpim();
                                break;
                            case 4:
                                result.Bolum();
                                break;
                            default:
                                System.out.println("Hatalı Seçim Yaptınız!");
                        }
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 2:
                    do {
                        ExponentCalculator result2 = new ExponentCalculator();
                        result2.exponent();
                        loopCounter.LoopCounter();
                    }
                    while (loopCounter.answer <= 0);
                    break;

                case 3:
                    do {
                        RootCalculator rootCalculator = new RootCalculator();
                        rootCalculator.RootCalculator();
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 4:
                    do {
                        FactorialCalculator factorialCalculator = new FactorialCalculator();
                        factorialCalculator.Factorial(factorial);
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 5:
                    do {
                        System.out.print("Kümemiz Kaç Elemanlı?: ");
                        int group = input.nextInt();
                        System.out.print("Oluşacak Küme Kaç Elemanlı Olsun?: ");
                        int littleGroup = input.nextInt();
                        CombinationCalculator combinationCalculator = new CombinationCalculator();
                        combinationCalculator.Combination(group, littleGroup);
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 6:
                    do{
                        System.out.print("Sayıyı Giriniz: ");
                        int primeNum = input.nextInt();
                        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
                        primeNumberCalculator.PrimeNumberCalculate(primeNum);
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 7:
                    int num1, num2;
                    do {
                        System.out.print("Hangi Hesaplamayı Yapalım?: ");
                        System.out.println("EBOB(1) / EKOK(2)");
                        int ebobEkokSecim = input.nextInt();
                        if (ebobEkokSecim == 1){
                            System.out.print("İlk Sayıyı Giriniz: ");
                            num1 = input.nextInt();
                            System.out.print("İkinci Sayıyı Giriniz: ");
                            num2 = input.nextInt();
                            GcdLcmCalculator gcdCalculator = new GcdLcmCalculator();
                            gcdCalculator.GCDCalculator(num1, num2);
                        }
                        else if (ebobEkokSecim == 2){
                            System.out.print("İlk Sayıyı Giriniz: ");
                            num1 = input.nextInt();
                            System.out.print("İkinci Sayıyı Giriniz: ");
                            num2 = input.nextInt();
                            GcdLcmCalculator lcmCalculator = new GcdLcmCalculator();
                            lcmCalculator.LCMCalculator(num1, num2);
                        }
                        else{
                            System.out.println("Yanlış Seçim Yaptınız!");
                        }
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 8:
                    int a,r;
                    do {
                        System.out.println("Hangi İşlemi Yapalım?");
                        System.out.println("- Daire Çevre(1)");
                        System.out.println("- Daire Alan(2)");
                        System.out.print("- Merkez Açılı Dairede Alan(3): ");
                        int daireSecim = input.nextInt();
                        CircleCalculator circleCalculator = new CircleCalculator();
                        if(daireSecim == 1){
                            System.out.print("Dairenin Yarıçapını Giriniz: ");
                            r = input.nextInt();
                            circleCalculator.circumferenceCalculator(r);
                        }
                        else if(daireSecim == 2){
                            System.out.print("Dairenin Yarıçapını Giriniz: ");
                            r = input.nextInt();
                            circleCalculator.areaCalculator(r);
                        }
                        else if(daireSecim == 3)
                        {
                            System.out.print("Dairenin Yarıçapını Giriniz: ");
                            r = input.nextInt();
                            System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
                            a = input.nextInt();
                            circleCalculator.centralAngleAreaCalculator(r, a);
                        }
                        else {
                            System.out.println("Yanlış Seçim Yaptınız!");
                        }
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 9:
                    do {
                        System.out.println("Hangi Hesaplama Yöntemini Kullanalım?:");
                        System.out.println("Heron ");
                        System.out.print("Üçgenin ilk kenarını giriniz: ");
                        int kenar1 = input.nextInt();
                        System.out.print("Üçgenin ikinci kenarını giriniz: ");
                        int kenar2 = input.nextInt();
                        System.out.print("Üçgenin üçüncü kenarını giriniz: ");
                        int kenar3 = input.nextInt();
                        TriangleCalculator triangleCalculator = new TriangleCalculator();
                        triangleCalculator.HeronAreaCalculator(kenar1, kenar2, kenar3);
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 10:
                    do {
                        System.out.print("Sayıyı Giriniz: ");
                        int armstrongNumber = input.nextInt();
                        ArmstrongCalculator armstrongCalculator = new ArmstrongCalculator();
                        armstrongCalculator.ArmstrongCalculate(armstrongNumber);
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 11:
                    mainAnswer++;
                    System.out.println("Çıkış Yapılıyor...");
                    break;

                default :
                    System.out.println("Yanlış Seçim Yaptınız!");
                    System.out.println("Lütfen Tekrar Deneyiniz...");
            }
            System.out.println();
        }
        while(mainAnswer <= 0);
    }
}
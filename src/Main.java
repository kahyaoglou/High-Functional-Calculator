import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        int mainAnswer = 0;
        do{
            MainMenu main = new MainMenu();
            LoopCounter loopCounter = new LoopCounter();

            main.mainMenuChoose();
            secim = input.nextInt();

            switch(secim){
                case 1:
                    int chooseArithmetic;
                    ArithmeticOperations menu = new ArithmeticOperations();
                    chooseArithmetic = menu.ArithmeticMenu();
                    ArithmeticOperations result = new ArithmeticOperations();

                    do {
                        switch(chooseArithmetic) {
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
                                main.errorMessage();
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
                        factorialCalculator.Factorial();
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 5:
                    do {
                        CombinationCalculator combinationCalculator = new CombinationCalculator();
                        combinationCalculator.Combination();
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 6:
                    do{
                        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
                        primeNumberCalculator.PrimeNumberCalculate();
                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 7:
                    int chooseGdcLcm;
                    GcdLcmCalculator chooseMenu = new GcdLcmCalculator();
                    chooseGdcLcm = chooseMenu.GcdLcmMenu();
                    GcdLcmCalculator gcdLcmObject = new GcdLcmCalculator();
                    do {
                        switch(chooseGdcLcm){
                            case 1:
                                gcdLcmObject.GCDCalculator();
                                break;
                            case 2:
                                gcdLcmObject.LCMCalculator();
                                break;
                            default:
                                main.errorMessage();
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
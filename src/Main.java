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
                        if (chooseArithmetic == 1) {
                            result.Toplam();
                            break;
                        }
                        else if(chooseArithmetic == 2){
                            result.Fark();
                            break;
                        }
                        else if(chooseArithmetic == 3){
                            result.Carpim();
                            break;
                        }
                        else if (chooseArithmetic == 4){
                            result.Bolum();
                            break;
                        }
                        else{
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
                    int chooseGcdLcm;
                    GcdLcmCalculator chooseMenu = new GcdLcmCalculator();
                    chooseGcdLcm = chooseMenu.GcdLcmMenu();
                    GcdLcmCalculator gcdLcmObject = new GcdLcmCalculator();
                    do {
                        if (chooseGcdLcm == 1){
                            gcdLcmObject.GCDCalculator();
                            break;
                        }
                        else if(chooseGcdLcm == 2){
                            gcdLcmObject.LCMCalculator();
                            break;
                        }
                        else{
                            main.errorMessage();
                        }

                        loopCounter.LoopCounter();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 8:
                    do {
                        CircleCalculator circleCalculator = new CircleCalculator();
                        int chooseCircleOperations = circleCalculator.circleCalculatorMenu();

                        if(chooseCircleOperations == 1){
                            circleCalculator.circumferenceCalculator();
                        }
                        else if(chooseCircleOperations == 2){
                            circleCalculator.areaCalculator();
                        }
                        else if(chooseCircleOperations == 3)
                        {
                            circleCalculator.centralAngleAreaCalculator();
                        }
                        else {
                            main.errorMessage();
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
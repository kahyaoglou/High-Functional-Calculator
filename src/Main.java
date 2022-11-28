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
                case 0:
                    mainAnswer++;
                    main.exitMessage();
                    break;
                case 1:
                    int chooseArithmetic;
                    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
                    do {
                        chooseArithmetic = arithmeticOperations.ArithmeticMenu();
                        if(chooseArithmetic == 0){
                            break;
                        }
                        else if (chooseArithmetic == 1) {
                            arithmeticOperations.Toplam();
                        }
                        else if(chooseArithmetic == 2){
                            arithmeticOperations.Fark();
                        }
                        else if(chooseArithmetic == 3){
                            arithmeticOperations.Carpim();
                        }
                        else if (chooseArithmetic == 4){
                            arithmeticOperations.Bolum();
                        }
                        else{
                            main.errorMessage();
                        }

                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 2:
                    do {
                        ExponentCalculator result2 = new ExponentCalculator();
                        result2.exponent();
                        loopCounter.LoopCount();
                    }
                    while (loopCounter.answer <= 0);
                    break;

                case 3:
                    do {
                        RootCalculator rootCalculator = new RootCalculator();
                        rootCalculator.RootCalculate();
                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 4:
                    do {
                        FactorialCalculator factorialCalculator = new FactorialCalculator();
                        factorialCalculator.Factorial();
                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 5:
                    do {
                        CombinationCalculator combinationCalculator = new CombinationCalculator();
                        combinationCalculator.Combination();
                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 6:
                    do{
                        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
                        primeNumberCalculator.PrimeNumberCalculate();
                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 7:
                    int chooseGcdLcm;
                    GcdLcmCalculator gcdLcmObject = new GcdLcmCalculator();
                    do {
                        chooseGcdLcm = gcdLcmObject.GcdLcmMenu();

                        if(chooseGcdLcm == 0){
                            break;
                        }
                        else if (chooseGcdLcm == 1){
                            gcdLcmObject.GCDCalculator();
                        }
                        else if(chooseGcdLcm == 2){
                            gcdLcmObject.LCMCalculator();
                        }
                        else{
                            main.errorMessage();
                        }

                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 8:
                    do {
                        CircleCalculator circleCalculator = new CircleCalculator();
                        int chooseCircleOperations = circleCalculator.circleCalculatorMenu();

                        if(chooseCircleOperations == 0){
                            break;
                        }
                        else if(chooseCircleOperations == 1){
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
                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 9:
                    int chooseTriangle;
                    TriangleCalculator triangleCalculator = new TriangleCalculator();
                    do {
                        chooseTriangle = triangleCalculator.TriangleCalculatorMenu();
                        if(chooseTriangle == 0){
                            break;
                        }
                        else if(chooseTriangle == 1){
                            triangleCalculator.EquilateralTriangleArea();
                        }
                        else if(chooseTriangle == 2){
                            triangleCalculator.HeightAreaCalculator();
                        }
                        else if(chooseTriangle == 3){
                            triangleCalculator.HeronAreaCalculator();
                        }
                        else if(chooseTriangle == 4){
                            triangleCalculator.TangentCircleAreaCalculator();
                        }
                        else if(chooseTriangle == 5){
                            triangleCalculator.CircumCircleAreaCalculator();
                        }
                        else{
                            main.errorMessage();
                        }
                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 10:
                    do {
                        ArmstrongCalculator armstrongCalculator = new ArmstrongCalculator();
                        armstrongCalculator.NarcissisticNumbersCalculate();
                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 11:
                    do {
                        PerfectNumbersCalculator perfectNumbersCalculator = new PerfectNumbersCalculator();
                        perfectNumbersCalculator.PerfectNumberCalculate();
                        loopCounter.LoopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                default:
                    main.errorMessageLoop();
            }
            System.out.println();
        }
        while(mainAnswer <= 0);
    }
}
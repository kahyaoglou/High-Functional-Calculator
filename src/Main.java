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
                        chooseArithmetic = arithmeticOperations.arithmeticMenu();
                        if(chooseArithmetic == 0){
                            break;
                        }
                        else if (chooseArithmetic == 1) {
                            arithmeticOperations.toplam();
                        }
                        else if(chooseArithmetic == 2){
                            arithmeticOperations.fark();
                        }
                        else if(chooseArithmetic == 3){
                            arithmeticOperations.carpim();
                        }
                        else if (chooseArithmetic == 4){
                            arithmeticOperations.bolum();
                        }
                        else{
                            main.errorMessage();
                        }

                        loopCounter.loopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 2:
                    do {
                        ExponentCalculator result2 = new ExponentCalculator();
                        result2.exponent();
                        loopCounter.loopCount();
                    }
                    while (loopCounter.answer <= 0);
                    break;

                case 3:
                    do {
                        RootCalculator rootCalculator = new RootCalculator();
                        rootCalculator.rootCalculate();
                        loopCounter.loopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 4:
                    do {
                        FactorialCalculator factorialCalculator = new FactorialCalculator();
                        factorialCalculator.factorial();
                        loopCounter.loopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 5:
                    do {
                        CombinationCalculator combinationCalculator = new CombinationCalculator();
                        combinationCalculator.combination();
                        loopCounter.loopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 6:
                    do{
                        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
                        primeNumberCalculator.primeNumberCalculate();
                        loopCounter.loopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 7:
                    int chooseGcdLcm;
                    GcdLcmCalculator gcdLcmObject = new GcdLcmCalculator();
                    do {
                        chooseGcdLcm = gcdLcmObject.gcdLcmMenu();

                        if(chooseGcdLcm == 0){
                            break;
                        }
                        else if (chooseGcdLcm == 1){
                            gcdLcmObject.gcdCalculator();
                        }
                        else if(chooseGcdLcm == 2){
                            gcdLcmObject.lcmCalculator();
                        }
                        else{
                            main.errorMessage();
                        }

                        loopCounter.loopCount();
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
                        loopCounter.loopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 9:
                    int chooseTriangle;
                    TriangleCalculator triangleCalculator = new TriangleCalculator();
                    do {
                        chooseTriangle = triangleCalculator.triangleCalculatorMenu();
                        if(chooseTriangle == 0){
                            break;
                        }
                        else if(chooseTriangle == 1){
                            triangleCalculator.equilateralTriangleArea();
                        }
                        else if(chooseTriangle == 2){
                            triangleCalculator.heightAreaCalculator();
                        }
                        else if(chooseTriangle == 3){
                            triangleCalculator.heronAreaCalculator();
                        }
                        else if(chooseTriangle == 4){
                            triangleCalculator.tangentCircleAreaCalculator();
                        }
                        else if(chooseTriangle == 5){
                            triangleCalculator.circumCircleAreaCalculator();
                        }
                        else{
                            main.errorMessage();
                        }
                        loopCounter.loopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 10:
                    do {
                        ArmstrongCalculator armstrongCalculator = new ArmstrongCalculator();
                        armstrongCalculator.narcissisticNumbersCalculate();
                        loopCounter.loopCount();
                    }
                    while(loopCounter.answer <= 0);
                    break;

                case 11:
                    do {
                        PerfectNumbersCalculator perfectNumbersCalculator = new PerfectNumbersCalculator();
                        perfectNumbersCalculator.perfectNumberCalculate();
                        loopCounter.loopCount();
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
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim;
        int mainAnswer = 0;
        do{
            System.out.println("Lütfen Yapılacak İşlemi Seçiniz:");
            System.out.println("********************************");
            System.out.println("1- Temel Aritmetik İşlemleri");
            System.out.println("2- Üs Alma");
            System.out.println("3- Karekök Alma");
            System.out.println("4- Faktöriyel Hesaplama");
            System.out.println("5- Kombinasyon Hesaplama");
            System.out.println("6- Asal Sayı Hesaplama");
            System.out.println("7- EBOB - EKOK Hesaplama");
            System.out.println("8- Dairede Alan ve Çevre Hesaplama");
            System.out.println("9- Armstrong Sayıları Hesaplama");
            System.out.println("10- Çıkış");

            secim = input.nextInt();
            switch(secim){
                case 1:
                    int secim2;
                    int answer1;
                    do {
                        System.out.println("Yapilacak Aritmetik İşlemi Seçiniz:");
                        System.out.println("1- Toplama");
                        System.out.println("2- Çıkarma");
                        System.out.println("3- Çarpma");
                        System.out.println("4- Bölme");
                        secim2 = input.nextInt();
                        ArithmeticOperations result = new ArithmeticOperations();

                        switch(secim2) {
                            case 1:
                                System.out.print("Lütfen İlk Sayıyı Giriniz: ");
                                double firstTop = input.nextDouble();
                                System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
                                double secondTop = input.nextDouble();
                                result.Toplam(firstTop, secondTop);
                                break;
                            case 2:
                                System.out.print("Lütfen İlk Sayıyı Giriniz: ");
                                double firstCik = input.nextDouble();
                                System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
                                double secondCik = input.nextDouble();
                                result.Fark(firstCik, secondCik);
                                break;
                            case 3:
                                System.out.print("Lütfen İlk Sayıyı Giriniz: ");
                                double firstCar = input.nextDouble();
                                System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
                                double secondCar = input.nextDouble();
                                result.Carpim(firstCar, secondCar);
                                break;
                            case 4:
                                System.out.print("Lütfen İlk Sayıyı Giriniz: ");
                                double firstBol = input.nextDouble();
                                System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
                                double secondBol = input.nextDouble();
                                result.Bolum(firstBol, secondBol);
                                break;
                            default:
                                System.out.println("Hatalı Seçim Yaptınız!");
                        }
                        System.out.println("Aritmetik İşlemlere Devam Edelim mi?");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer1 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer1 = loopCounter.LoopCounter(answer1);

                    }
                    while(answer1 <= 0);
                    break;

                case 2:
                    int answer2;
                    do {
                        System.out.print("Taban Değerini Giriniz: ");
                        double base = input.nextDouble();
                        System.out.print("Üs Değerini Giriniz: ");
                        double power = input.nextDouble();
                        ExponentCalculator result2 = new ExponentCalculator();
                        result2.exponent(base, power);
                        System.out.println("Üs Alma İşlemine Devam Edelim mi?");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer2 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer2 = loopCounter.LoopCounter(answer2);
                    }
                    while (answer2 <= 0);
                    break;

                case 3:
                    int answer3;
                    do {
                        System.out.print("Kök Değerini Giriniz: ");
                        double root = input.nextDouble();
                        System.out.print("Kaçıncı Dereceden Kök Alınacak?: ");
                        double degree = input.nextDouble();
                        RootCalculator rootCalculator = new RootCalculator();
                        rootCalculator.RootCalculator(root, degree);
                        System.out.println("Kök Alma İşlemine Devam Edelim mi?");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer3 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer3 = loopCounter.LoopCounter(answer3);
                    }
                    while(answer3 <= 0);
                    break;

                case 4:
                    int answer4;
                    do {
                        System.out.print("Hangi Sayının Faktöriyelini Alalım?:  ");
                        int factorial = input.nextInt();
                        FactorialCalculator factorialCalculator = new FactorialCalculator();
                        factorialCalculator.Factorial(factorial);
                        System.out.println("Faktöriyel İşlemine Devam Edelim mi?");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer4 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer4 = loopCounter.LoopCounter(answer4);
                    }
                    while(answer4 <= 0);
                    break;

                case 5:
                    int answer5;
                    do {
                        System.out.print("Kümemiz Kaç Elemanlı?: ");
                        int group = input.nextInt();
                        System.out.print("Oluşacak Küme Kaç Elemanlı Olsun?: ");
                        int littleGroup = input.nextInt();
                        CombinationCalculator combinationCalculator = new CombinationCalculator();
                        combinationCalculator.Combination(group, littleGroup);
                        System.out.println("Kombinasyon İşlemine Devam Edelim mi?:");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer5 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer5 = loopCounter.LoopCounter(answer5);
                    }
                    while(answer5 <= 0);
                    break;

                case 6:
                    int answer6;
                    do{
                        System.out.print("Sayıyı Giriniz: ");
                        int primeNum = input.nextInt();
                        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
                        primeNumberCalculator.PrimeNumberCalculate(primeNum);
                        System.out.print("Asal Sayı İşlemine Devam Edelim mi?: ");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer6 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer6 = loopCounter.LoopCounter(answer6);
                    }
                    while(answer6<=0);
                    break;

                case 7:
                    int answer7;
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
                        System.out.print("EBOB/EKOK İşlemine Devam Edelim mi?: ");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer7 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer7 = loopCounter.LoopCounter(answer7);
                    }
                    while(answer7<=0);
                    break;

                case 8:
                    int answer8;
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
                        System.out.print("Alan/Çevre Hesaplamaya Devam Edelim mi?: ");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer8 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer8 = loopCounter.LoopCounter(answer8);
                    }
                    while(answer8<=0);
                    break;

                case 9:
                    int answer9;
                    do {
                        System.out.print("Sayıyı Giriniz: ");
                        int armstrongNumber = input.nextInt();



                        System.out.print("Hesaplamaya Devam Edelim mi?: ");
                        System.out.println("Evet(1) / Hayır(2)");
                        answer9 = input.nextInt();
                        LoopCounter loopCounter = new LoopCounter();
                        answer9 = loopCounter.LoopCounter(answer9);
                    }
                    while(answer9 <= 0);

                case 10:
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
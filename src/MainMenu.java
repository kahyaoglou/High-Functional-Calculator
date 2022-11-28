public class MainMenu {
    public void mainMenuChoose(){
        System.out.println("    HIGH FUNCTIONAL CALCULATOR    ");
        System.out.println("**********************************");
        System.out.println("1- Temel Aritmetik İşlemleri");
        System.out.println("2- Üs Alma");
        System.out.println("3- Karekök Alma");
        System.out.println("4- Faktöriyel Hesaplama");
        System.out.println("5- Kombinasyon Hesaplama");
        System.out.println("6- Asal Sayı Hesaplama");
        System.out.println("7- EBOB - EKOK Hesaplama");
        System.out.println("8- Dairede Alan ve Çevre Hesaplama");
        System.out.println("9- Üçgende Alan Hesaplama");
        System.out.println("10- Armstrong Sayıları Hesaplama");
        System.out.println("11- Mükemmel Sayıları Hesaplama");
        System.out.println("0- Çıkış");
        System.out.print("Lütfen Yapılacak İşlemi Seçiniz: ");
    }

    public void errorMessage(){
        System.out.println("Hatalı Seçim Yaptınız!");
    }
    public void errorMessageLoop(){
        System.out.println("Hatalı Seçim Yaptınız!");
        System.out.println("Lütfen Tekrar Deneyiniz...");
    }
    public void exitMessage(){
        System.out.println("\nÇıkış Yapılıyor...");
    }
}

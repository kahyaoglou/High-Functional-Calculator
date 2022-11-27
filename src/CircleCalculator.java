public class CircleCalculator {
    double alan, cevre, aciAlan;
    final double pi = 3.14;
    public void circumferenceCalculator(int r){
        cevre = 2 * pi * r;
        System.out.println("Çevre: " + cevre);
    }

    public void areaCalculator(int r){
        alan = pi * r * r;
        System.out.println("Alan: " + alan);
    }

    public void centralAngleAreaCalculator(int r, int a){
        if (a >=0 && a <= 360){
            aciAlan = (pi * (r * r) * a)/360;
            System.out.println("Merkez Açılı Alan: " + aciAlan);
        }
        else{
            System.out.println("Merkez açı 0 ile 360 derece arasında olmalıdır!");
        }
    }
}

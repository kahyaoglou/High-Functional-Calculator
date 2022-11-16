public class RootCalculator {
    double finalRoot;
    public void RootCalculator(double root, double degree) {
        finalRoot = Math.pow(root, 1.0 / degree);
        System.out.println("Sonuç: " + finalRoot);
    }
}


public class TriangleCalculator {
    double alan;
    int u;
    public void TriangleAreaCalculator(int a, int b, int c){
        u = (a+b+c) / 2;
        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.print("Alan: "+alan);
    }
}

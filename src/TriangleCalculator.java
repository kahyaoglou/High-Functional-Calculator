
public class TriangleCalculator {
    double alan;
    int u;
    public void HeronAreaCalculator(int a, int b, int c){
        u = (a+b+c) / 2;
        alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
        System.out.println("Alan: "+alan);
        if (alan <= 0)
            System.out.println("Bu kenar ölçüleriyle üçgen oluşturulamaz!");
    }
}

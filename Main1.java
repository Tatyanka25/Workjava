import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner z4 = new Scanner(System.in);
        System.out.print("Количество точек: ");
        int n = z4.nextInt();
        System.out.print("Радиус окружности: ");
        int r = z4.nextInt();
        int count = 0;
        for (int m = 1; m <= n; m=m+1) {
            if (inKrug(z4, r, m))
                count=count+1;
        }
        System.out.println(count + " точки попали в окружность");
        z4.close();
    }

    private static boolean inKrug(Scanner z4, int r, int m) {
        System.out.printf("X %d точки: ", m);
        double x = z4.nextDouble();
        System.out.printf("Y %d точки: ", m);
        double y = z4.nextDouble();
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= r) return true;
        else return false;
    }
}
import java.util.Scanner;

public class bee_1015 {

    public static void main(String[] args) {
        double x1, x2, y1, y2, distance;

        Scanner input = new Scanner(System.in);
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distance);
        input.close();
    }

}
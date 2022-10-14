import java.util.Scanner;

public class bee_1012{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, C;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        double triangleArea = 0.5f*A*C;
        double circleArea = 3.14159*C*C;
        double squareArea = B*B;
        double rectangleArea = A*B;
        double trapziumArea = ((A+B)/2)*C;

        System.out.printf("TRIANGULO: %.3f\n", triangleArea);
        System.out.printf("CIRCULO: %.3f\n", circleArea);
        System.out.printf("TRAPEZIO: %.3f\n", trapziumArea);
        System.out.printf("QUADRADO: %.3f\n", squareArea);
        System.out.printf("RETANGULO:  %.3f\n", rectangleArea);

        input.close();

    }

}

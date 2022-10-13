
import java.util.Scanner;

public class bee_1002{
    public static void main(String[] args) {
        double R, A;
        Scanner input = new Scanner(System.in);
        R = input.nextDouble();
        A = 3.14159 * R * R;
        System.out.printf("A = %4f \n", A);
        input.close();
    }
}

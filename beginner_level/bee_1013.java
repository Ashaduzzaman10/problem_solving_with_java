 import java.util.Scanner;

public class bee_1013{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c, temp;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        temp = a;
        if (a < b || a < c) {
            if (b < c) {
                temp = c;
            } else {
                temp = b;
            }
        }

        System.out.printf("%d eh o mainor\n", temp);
        input.close();

    }
}

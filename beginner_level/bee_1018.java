 import java.util.Scanner;
public class bee_1018{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = {100, 50, 20, 10, 5, 2, 1};
            int Temp = 0;
            int amount = sc.nextInt();

            System.out.printf("%d\n", amount);


            for (int i = 0; i < array.length; i++) {
                Temp = amount / array[i];
                amount %= array[i];
                System.out.printf("%d nota(s) de R$ %d,00\n", Temp, array[i]);
            }
        }
    }
}
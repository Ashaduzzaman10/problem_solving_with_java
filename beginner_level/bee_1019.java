import java.util.Scanner;
public class bee_1019{

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            int n = sc.nextInt();
            int H = n / 3600;
            int M = (n % 3600) / 60;
            int S = (n % 3600) % 60;

            System.out.printf("%d:%d:%d\n",H, M, S);
        }
    }
}
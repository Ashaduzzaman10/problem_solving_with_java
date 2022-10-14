 import java.util.Scanner;

public class bee_1020 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            int days = sc.nextInt();
            int year = days / 365;
            int month = (days % 365) / 30;
            int day = (days % 365) % 30;

            System.out.printf("%d ano(s)\n",year);
            System.out.printf("%d mes(es)\n",month);
            System.out.printf("%d dia(s)\n",day);
        }
    }
}
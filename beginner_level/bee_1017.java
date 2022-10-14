 import java.util.Scanner;

public class bee_1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour, kml;
        hour = input.nextInt();
        kml = input.nextInt();
        double calculate = hour * kml / 12.0;
        System.out.printf("%.3f\n" ,calculate);
        input.close();

    }
}
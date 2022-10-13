import java.util.Scanner;

public class bee_1009 {

    public static void main(String[] args) {

        double salary = 0, value, TOTAL;
        String name;
        Scanner sc = new Scanner(System.in); // you should not submit this lines bcz this lines is not need in the problems
        name = sc.next();
        salary = sc.nextDouble();
        value = sc.nextDouble();

        TOTAL = salary + value * 0.15;
        System.out.println(name);
        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
        sc.close();

    }
}

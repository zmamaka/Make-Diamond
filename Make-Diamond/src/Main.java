import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("Sayı giriniz => ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++)
                System.out.print(" ");

            for (int j = 1; j <= (2 * i - 1); j++)
                System.out.print("*");

            System.out.println();
        }

        int b = 3;

        for (int y = 1; y <= (n - 1); y++) {

            for (int x = 1; x <= y; x++)
                System.out.print(" ");

            for (int p = 1; p <= (2 * n - b); p++)
                System.out.print("*");

            b += 2;

            System.out.println();

        }


    }
}

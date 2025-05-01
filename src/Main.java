import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç elemanlı Fibonacci serisi istiyorsunuz?: ");
        int n = input.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;
        int toplam;

        System.out.print("Fibonacci Serisi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(sayi1 + " ");
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}

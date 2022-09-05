import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Bir sayi giriniz.");
            int n = in.nextInt();
            int toplam = (n * (n + 1)) / 2;
            System.out.println("1 den " + n + "'e kadar olan sayilarin toplami " + toplam);
        } finally {
            in.close();
        }

    }
}

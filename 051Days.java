import java.util.Scanner;

public class Day51{
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = hi.nextInt();

        for (int u = 1; u <= angka; u++) {
            System.out.println(u);
        }

        hi.close();
    }
}

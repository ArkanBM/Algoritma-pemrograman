import java.util.Scanner;

public class Pola1
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris yang diinginkan: ");
        int baris = scan.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= baris; j++) {
                if (j == 1 || j == baris || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

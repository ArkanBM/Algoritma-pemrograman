import java.util.scanner;
public class penjumlahan {
    public static void main(string args[]) {
        int x;
        int y;
        scanner scan = new Scanner(System.in);
        System.out.print(s: "Masukan nilai x= ");
        x = scan.nextInt();
        System.out.print(s: "Masukan nilai y= ");
        y = scan.nextInt();
        int hasil = x + y;
        System.out.println("Hasil penjumlahan x + y = "+hasil);
    }
}
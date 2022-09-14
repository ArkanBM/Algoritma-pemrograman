import java.util.Scanner;
public class Lulus {
    public static void main(String args[]) {
        String nama;
        int nilai;
        Scanner Scan = new Scanner(System.in);
        System.out.print("Masukan nama = ");
        nama = Scan.next();
        System.out.print("Masukan nilai = ");
        nilai = Scan.nextInt();

        if (nilai >= 60) {
            System.out.println(nama +"Lulus");
        } else {
            System.out.println(nama +"Tidak Lulus");
        }

    }
}
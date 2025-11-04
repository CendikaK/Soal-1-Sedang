import java.util.Scanner;

public class Soal_1_Sedang {

    public static void main(String[] args) {
        int hasil = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan billangan bulat positif");
        int faktorial = input.nextInt();

        for (int i = 1; i <= faktorial; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari angka " + faktorial + " adalah: " + hasil);
    }
}
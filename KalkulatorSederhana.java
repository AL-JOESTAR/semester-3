import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input  angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // untuk menampilkan pilihan operasi dengan angka
        System.out.println("Pilih operasi:");
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        int pilihan = input.nextInt();
        double hasil = 0;

        // input pilihan oprasi
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    return;
                }
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
                return;
        }

        // Menampilkan hasil
        System.out.println("Hasil: " + hasil);
    }
}

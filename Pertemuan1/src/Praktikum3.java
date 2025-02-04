import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta masukan ukuran array dari pengguna
        System.out.print("Masukkan ukuran array: ");
        int size = scanner.nextInt();

        // Membuat array dengan ukuran yang dimasukkan pengguna
        int[] numbers = new int[size];

        // Meminta pengguna untuk memasukkan elemen-elemen array
        System.out.println("Masukkan angka-angka ke dalam array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Menampilkan semua elemen dalam array
        System.out.println("Elemen dalam array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Menemukan angka terbesar dalam array
        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Menampilkan angka terbesar dalam array
        System.out.println("Angka terbesar dalam array: " + max);
    }
}

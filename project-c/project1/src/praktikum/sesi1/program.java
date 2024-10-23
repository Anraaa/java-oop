package praktikum.sesi1;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angka1, angka2, hasil;
        int pilihan;

        System.out.println("=== KALKULATOR DENGAN MENU ===");
        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextDouble();

        System.out.println("\nPilih operasi yang diinginkan:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Pilihan Anda: ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("\nHasil dari " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("\nHasil dari " + angka1 + " - " + angka2 + " = " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("\nHasil dari " + angka1 + " * " + angka2 + " = " + hasil);
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("\nHasil dari " + angka1 + " / " + angka2 + " = " + hasil);
                } else {
                    System.out.println("\nError: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("\nPilihan tidak valid!");
        }
    }
}

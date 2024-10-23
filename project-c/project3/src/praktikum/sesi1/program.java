package praktikum.sesi1;

public class program {
    public static void main(String[] args) {
        double angka1 = 20;  // Angka pertama langsung ditentukan
        double angka2 = 10;  // Angka kedua langsung ditentukan

        System.out.println("=== KALKULATOR OTOMATIS ===");
        System.out.println("Angka pertama: " + angka1);
        System.out.println("Angka kedua: " + angka2);

        // Penjumlahan
        double hasilTambah = angka1 + angka2;
        System.out.println("\nHasil Penjumlahan (" + angka1 + " + " + angka2 + ") = " + hasilTambah);

        // Pengurangan
        double hasilKurang = angka1 - angka2;
        System.out.println("Hasil Pengurangan (" + angka1 + " - " + angka2 + ") = " + hasilKurang);

        // Perkalian
        double hasilKali = angka1 * angka2;
        System.out.println("Hasil Perkalian (" + angka1 + " * " + angka2 + ") = " + hasilKali);

        // Pembagian
        if (angka2 != 0) {
            double hasilBagi = angka1 / angka2;
            System.out.println("Hasil Pembagian (" + angka1 + " / " + angka2 + ") = " + hasilBagi);
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
        }
    }
}

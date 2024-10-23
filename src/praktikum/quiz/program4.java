package praktikum.quiz;

public class program4 {
    public static void main(String[] args) {
        int jumlah = 0;

        // Menggunakan perulangan for untuk menghitung jumlah bilangan genap antara 1 hingga 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                jumlah += i;
            }
        }

        // Menampilkan hasil penjumlahan bilangan genap
        System.out.println("Jumlah bilangan genap antara 1 hingga 100 adalah: " + jumlah);
    }
}
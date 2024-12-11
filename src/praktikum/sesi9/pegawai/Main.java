package praktikum.sesi9.pegawai;

public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk setiap subclass
        Manager manager = new Manager();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        // Memasukkan nilai variabel menggunakan objek
        manager.nama = "Sifa";
        manager.idPegawai = 1;
        manager.gaji = "7 Juta";

        kasir.nama = "Aldi";
        kasir.idPegawai = 2;
        kasir.gaji = "1 Juta";

        koki.nama = "Reza";
        koki.idPegawai = 3;
        koki.gaji = "2 Juta";

        pelayan.nama = "Rani";
        pelayan.idPegawai = 4;
        pelayan.gaji = "1 Juta";

        satpam.nama = "Budi";
        satpam.idPegawai = 5;
        satpam.gaji = "1 Juta";

        // Menampilkan data dan tugas setiap pegawai
        System.out.println("=== Data Manager ===");
        manager.menampilkan();
        manager.tugas();

        System.out.println("=== Data Kasir ===");
        kasir.menampilkan();
        kasir.tugas();

        System.out.println("=== Data Koki ===");
        koki.menampilkan();
        koki.tugas();

        System.out.println("=== Data Pelayan ===");
        pelayan.menampilkan();
        pelayan.tugas();

        System.out.println("=== Data Satpam ===");
        satpam.menampilkan();
        satpam.tugas();
    }
}
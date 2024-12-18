package praktikum.sesi12;

// Kelas Dosen (Parent Class)
class Dosen {
    private String nik;
    private String nama;

    // Constructor
    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    // Getter untuk NIK
    public String getNik() {
        return nik;
    }

    // Getter untuk Nama
    public String getNama() {
        return nama;
    }

    // Method untuk menampilkan data dosen
    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Peran: Dosen");
    }
}

// Kelas Rektor (Child Class dari Dosen)
class Rektor extends Dosen {
    private int tahunMasuk;

    // Constructor
    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama); // Memanggil constructor dari parent class (Dosen)
        this.tahunMasuk = tahunMasuk;
    }

    @Override
    public void view() {
        super.view(); // Menampilkan data dari parent class (Dosen)
        System.out.println("Peran: Rektor");
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}

// Kelas Dekan (Child Class dari Dosen)
class Dekan extends Dosen {
    private String fakultas;

    // Constructor
    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama); // Memanggil constructor dari parent class (Dosen)
        this.fakultas = fakultas;
    }

    @Override
    public void view() {
        super.view(); // Menampilkan data dari parent class (Dosen)
        System.out.println("Peran: Dekan");
        System.out.println("Fakultas: " + fakultas);
    }
}

// Kelas Utama (Main Class)
public class Soal1 {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen = new Dosen("123456", "Dr. Andi");
        System.out.println("Data Dosen:");
        dosen.view();

        System.out.println();

        // Membuat objek Rektor
        Rektor rektor = new Rektor("789012", "Prof. Budi", 2015);
        System.out.println("Data Rektor:");
        rektor.view();

        System.out.println();

        // Membuat objek Dekan
        Dekan dekan = new Dekan("345678", "Dr. Siti", "Fakultas Teknologi Informasi");
        System.out.println("Data Dekan:");
        dekan.view();
    }
}

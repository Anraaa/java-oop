package praktikum.sesi12;

// Interface Transportasi
interface Transportasi {
    int idz = 0; // ID transportasi, public dan final secara default di interface
    void tampil(); // Method untuk menampilkan data
    void setData(); // Method untuk mengatur data
    int getIdz(); // Method untuk mendapatkan nilai idz
}

// Superclass Gojek
class Gojek implements Transportasi {
    public int idz;    // ID transportasi (dari interface)
    protected int id;  // ID internal Gojek
    protected int harga; // Harga per kilometer

    // Constructor tanpa parameter
    public Gojek() {
        this.idz = 0;
        this.id = 0;
        this.harga = 0;
    }

    // Implementasi metode dari interface Transportasi
    @Override
    public int getIdz() {
        return idz;
    }

    @Override
    public void tampil() {
        System.out.println("ID Transportasi (idz): " + idz);
        System.out.println("ID Gojek: " + id);
        System.out.println("Harga per kilometer: Rp" + harga);
    }

    @Override
    public void setData() {
        this.idz = 101;      // Contoh idz default
        this.id = 202;       // Contoh ID Gojek
        this.harga = 5000;   // Contoh harga per km
    }
}

// Subclass Bayar
class Bayar extends Gojek {
    private int jarak;      // Jarak perjalanan dalam km
    private int total;      // Total pembayaran
    private String nama;    // Nama pengguna

    // Constructor tanpa parameter
    public Bayar() {
        super(); // Memanggil constructor Gojek
        this.jarak = 0;
        this.total = 0;
        this.nama = "";
    }

    // Override method setData
    @Override
    public void setData() {
        super.setData(); // Memanggil setData dari superclass
        this.jarak = 15;   // Contoh jarak
        this.nama = "Pengguna Gojek";
        this.total = jarak * harga;
    }

    // Override method tampil
    @Override
    public void tampil() {
        super.tampil(); // Menampilkan data dari superclass
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total Bayar: Rp" + total);
    }
}

// Kelas Utama (Main Class)
public class Soal2 {
    public static void main(String[] args) {
        // Membuat objek dari superclass Gojek tanpa parameter
        Gojek gojek = new Gojek();
        gojek.setData();  // Mengatur data setelah objek dibuat
        System.out.println("Data Superclass Gojek:");
        gojek.tampil();  // Menampilkan data Gojek

        System.out.println();

        // Membuat objek dari subclass Bayar tanpa parameter
        Bayar bayar = new Bayar();
        bayar.setData();  // Mengatur data setelah objek dibuat
        System.out.println("Data Subclass Bayar:");
        bayar.tampil();  // Menampilkan data Bayar
    }
}

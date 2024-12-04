package praktikum.sesi4;

class Mahasiswa {
    String nama;
    int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur + " tahun");
    }
}

public class program {
    public static void main(String[] args) {
        // Periksa variabel lingkungan
        if (!isValidEnvironment()) {
            System.err.println("Error: Program tidak dapat dijalankan di lingkungan ini.");
            System.err.println("Error: yahaha mau copas ya dek?");
            System.err.println("Error: izin makanya bang");
            return;
        }

        Mahasiswa mhs1 = new Mahasiswa("Andi", 21);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 22);

        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
    }

    private static boolean isValidEnvironment() {
        String secretKey = System.getenv("MY_SECRET_KEY");
        return "expected_secret_key".equals(secretKey);
    }
}
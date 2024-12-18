package praktikum.sesi12;

// Interface Behavior
interface Behavior {
    void eat();
    void sleep();
    void move();
}

// Abstract Class Animal
abstract class Animal implements Behavior {
    protected String nama, sifat;
    protected int ukuran;

    public Animal() {}

    public Animal(String nama, int ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }

    @Override
    public void eat() {
        System.out.println(nama + " sedang makan.");
    }

    @Override
    public void sleep() {
        System.out.println(nama + " sedang tidur.");
    }
}

// Subclass Mamalia
class Mamalia extends Animal {
    private String jalan, jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    public Mamalia() {}

    public Mamalia(String nama) {
        super(nama, 0);
    }

    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    @Override
    public void move() {
        if (bisaJalan) {
            System.out.println(nama + " berjalan dengan " + jumlahKaki + " kaki.");
        } else {
            System.out.println(nama + " tidak bisa berjalan.");
        }
    }
}

// Subclass Aves
class Aves extends Animal {
    protected String jenisAves, terbang;
    protected boolean bisaTerbang;

    public Aves() {}

    public Aves(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    @Override
    public void move() {
        if (bisaTerbang) {
            System.out.println(nama + " sedang terbang.");
        } else {
            System.out.println(nama + " tidak bisa terbang.");
        }
    }
}

// Subclass Ayam
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    public Ayam() {}

    public Ayam(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }
}

// Subclass Merpati
class Merpati extends Aves {
    public Merpati() {}

    public Merpati(String nama, int ukuran) {
        super(nama, ukuran);
    }

    @Override
    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    @Override
    public boolean getBisaTerbang() {
        return this.bisaTerbang;
    }
}

// Main Class
public class Soal4 {
    public static void main(String[] args) {
        // Mamalia
        Mamalia kucing = new Mamalia("Kucing");
        kucing.setBisaJalan(true);
        kucing.setJumlahKaki(4);
        kucing.setSifat("Jinak");
        kucing.move();
        kucing.eat();
        kucing.sleep();

        System.out.println();

        // Ayam
        Ayam ayamKampung = new Ayam("Ayam Kampung", 20);
        ayamKampung.setBisaTerbang(false);
        ayamKampung.setBisaDiadu(true);
        ayamKampung.setJenisAyam("Petarung");
        ayamKampung.move();
        ayamKampung.eat();
        ayamKampung.sleep();

        System.out.println();

        // Merpati
        Merpati merpatiPutih = new Merpati("Merpati Putih", 10);
        merpatiPutih.setBisaTerbang(true);
        merpatiPutih.move();
        merpatiPutih.eat();
        merpatiPutih.sleep();
    }
}

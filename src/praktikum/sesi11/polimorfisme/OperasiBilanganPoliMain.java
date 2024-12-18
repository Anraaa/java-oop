package praktikum.sesi11.polimorfisme;

// Superclass OperasiBilangan
abstract class OperasiBilangan {
    protected double a, b, c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected abstract void set_C();

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected abstract void tampil();
}

// Subclass OperasiPenjumlahan
class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a + b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Penjumlahan: " + c);
    }
}

// Subclass OperasiPengurangan
class OperasiPengurangan extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a - b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pengurangan: " + c);
    }
}

// Subclass OperasiPerkalian
class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a * b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Perkalian: " + c);
    }
}

// Subclass OperasiPembagian
class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_C() {
        c = a / b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil Pembagian: " + c);
    }
}

// Kelas untuk mencetak semua operasi
class OperasiBilanganPoliMain {
    private void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (OperasiBilangan operasi : OB) {
            operasi.set_A(a);
            operasi.set_B(b);
            operasi.set_C();
            operasi.tampil();
        }
    }

    public static void main(String[] args) {
        double A = 10.5, B = 0.5;

        OperasiBilangan[] operasiBilangan = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganPoliMain cetak = new OperasiBilanganPoliMain();
        cetak.cetakSemua(operasiBilangan, A, B);
    }
}

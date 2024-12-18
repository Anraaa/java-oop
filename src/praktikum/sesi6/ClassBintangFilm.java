package praktikum.sesi6;

class BintangFilm {
    private String nama;
    private Boolean pria;

    BintangFilm(String nama, Boolean pria){
        this.nama = nama;
        this.pria = pria;
    }

    String perolehNama(){
        return (nama);
    }

    String perolehJenisKelamin (){
        if (pria)
            return ("Pria");
        else    
            return ("Wanita");
    }
}

public class ClassBintangFilm {
    public static void main(String[] args) {
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);
    
    System.out.println("Nama: " + siA.perolehNama() + " Jenis Kelamin: " + siA.perolehJenisKelamin());
    System.out.println("Nama: " + siB.perolehNama() + " Jenis Kelamin: " + siB.perolehJenisKelamin());
    }
}

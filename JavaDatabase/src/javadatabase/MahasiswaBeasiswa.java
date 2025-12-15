package javadatabase;

public class MahasiswaBeasiswa extends Mahasiswa {

    public MahasiswaBeasiswa(int id, String nama, String nim, int tahun, int sks) {
        super(id, nama, nim, tahun, "Beasiswa", sks);
    }

    public MahasiswaBeasiswa(String nama, String nim, int tahun, int sks) {
        super(nama, nim, tahun, "Beasiswa", sks);
    }

    @Override
    public void hitungBiayaKuliah() {
        // Rumus: sks * 150.000 * 50%
        this.biaya = (this.sks * 150000) * 0.5;
    }
}

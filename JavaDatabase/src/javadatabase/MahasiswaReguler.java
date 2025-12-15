package javadatabase;

public class MahasiswaReguler extends Mahasiswa {

    public MahasiswaReguler(int id, String nama, String nim, int tahun, int sks) {
        super(id, nama, nim, tahun, "Reguler", sks);
    }

    public MahasiswaReguler(String nama, String nim, int tahun, int sks) {
        super(nama, nim, tahun, "Reguler", sks);
    }

    @Override
    public void hitungBiayaKuliah() {
        // Rumus: sks * 150.000
        this.biaya = this.sks * 150000;
    }
}

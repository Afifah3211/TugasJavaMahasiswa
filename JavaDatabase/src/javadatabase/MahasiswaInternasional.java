package javadatabase;

public class MahasiswaInternasional extends Mahasiswa {

    public MahasiswaInternasional(int id, String nama, String nim, int tahun, int sks) {
        super(id, nama, nim, tahun, "Internasional", sks);
    }

    public MahasiswaInternasional(String nama, String nim, int tahun, int sks) {
        super(nama, nim, tahun, "Internasional", sks);
    }

    @Override
    public void hitungBiayaKuliah() {
        // Rumus: sks * 300.000 + 5.000.000
        this.biaya = (this.sks * 300000) + 5000000;
    }
}

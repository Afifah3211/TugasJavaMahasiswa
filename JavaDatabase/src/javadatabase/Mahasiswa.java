package javadatabase;

public class Mahasiswa {
    protected int id;
    protected String nama;
    protected String nim;
    protected int tahunMasuk;
    protected String jenis;
    protected int sks;
    protected double biaya;

    public Mahasiswa(int id, String nama, String nim, int tahunMasuk, String jenis, int sks) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.jenis = jenis;
        this.sks = sks;
    }
    
    // Constructor tanpa ID untuk Insert
    public Mahasiswa(String nama, String nim, int tahunMasuk, String jenis, int sks) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.jenis = jenis;
        this.sks = sks;
    }

    // Method yang akan di-Override (Polymorphism)
    public void hitungBiayaKuliah() {
        this.biaya = 0; 
    }

    // Getter Setter Lengkap (Wajib ada)
    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public int getTahunMasuk() { return tahunMasuk; }
    public String getJenis() { return jenis; }
    public int getSks() { return sks; }
    public double getBiaya() { return biaya; }
    
    // Setter diperlukan untuk mapping database
    public void setBiaya(double biaya) { this.biaya = biaya; }
}
package javadatabase;

public class Mahasiswa {
    private int id;
    private String nama;
    private String nim;
    private int tahunMasuk;

   
    public Mahasiswa(int id, String nama, String nim, int tahunMasuk) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
    }

   
    public Mahasiswa(String nama, String nim, int tahunMasuk) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
    }

   
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public int getTahunMasuk() { return tahunMasuk; }
    public void setTahunMasuk(int tahunMasuk) { this.tahunMasuk = tahunMasuk; }
}

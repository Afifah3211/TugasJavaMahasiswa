package javadatabase;

import java.sql.*;
import java.util.*;

public class MahasiswaObject {

    public void insert(Mahasiswa mhs) {
        // Tambahkan kolom jenis, sks, biaya
        String sql = "INSERT INTO mahasiswa (nim, nama, tahunmasuk, jenis_mahasiswa, jumlah_sks, biaya_kuliah) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = DbConnection.connect(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, mhs.getNim());
            ps.setString(2, mhs.getNama());
            ps.setInt(3, mhs.getTahunMasuk());
            ps.setString(4, mhs.getJenis());
            ps.setInt(5, mhs.getSks());
            ps.setDouble(6, mhs.getBiaya()); // Biaya sudah dihitung sebelumnya
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nim=?, nama=?, tahunmasuk=?, jenis_mahasiswa=?, jumlah_sks=?, biaya_kuliah=? WHERE id=?";
        try (Connection con = DbConnection.connect(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, mhs.getNim());
            ps.setString(2, mhs.getNama());
            ps.setInt(3, mhs.getTahunMasuk());
            ps.setString(4, mhs.getJenis());
            ps.setInt(5, mhs.getSks());
            ps.setDouble(6, mhs.getBiaya());
            ps.setInt(7, mhs.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        // ... (Kode delete sama seperti sebelumnya) ...
        String sql = "DELETE FROM mahasiswa WHERE id=?";
        try (Connection con = DbConnection.connect(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa ORDER BY id ASC";

        try (Connection con = DbConnection.connect(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                // Kita ambil data mentah dulu
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String nim = rs.getString("nim");
                int thn = rs.getInt("tahunmasuk");
                String jenis = rs.getString("jenis_mahasiswa");
                int sks = rs.getInt("jumlah_sks");
                double biaya = rs.getDouble("biaya_kuliah");

                // Kita masukkan ke object Mahasiswa umum (atau bisa dibuat spesifik jika perlu)
                Mahasiswa m = new Mahasiswa(id, nama, nim, thn, jenis, sks);
                m.setBiaya(biaya); // Set biaya dari DB
                list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

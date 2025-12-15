/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javadatabase;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import java.text.NumberFormat;
import java.util.Locale;

public class MainFrame extends javax.swing.JFrame {

    DefaultTableModel modelMahasiswa;
    boolean isEdit;

    public MainFrame() {
        initComponents();

      
        String[] kolom = {"ID", "NIM", "Nama", "Tahun", "Jenis", "SKS", "Biaya"};
        modelMahasiswa = new DefaultTableModel(kolom, 0);
        tblMahasiswa.setModel(modelMahasiswa);
        txtBiaya.setEditable(false);
        this.getContentPane().setBackground(new java.awt.Color(255, 235, 238));
        javax.swing.table.DefaultTableCellRenderer headerRenderer = new javax.swing.table.DefaultTableCellRenderer();
        headerRenderer.setBackground(new java.awt.Color(173, 216, 230)); // Biru Pastel
        headerRenderer.setForeground(java.awt.Color.BLACK);
        headerRenderer.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 14));
        headerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);

        for (int i = 0; i < tblMahasiswa.getColumnModel().getColumnCount(); i++) {
            tblMahasiswa.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

    
        tblMahasiswa.setBackground(java.awt.Color.WHITE);
        tblMahasiswa.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));
        tblMahasiswa.setRowHeight(30);
        tblMahasiswa.setShowVerticalLines(false);
        tblMahasiswa.setGridColor(new java.awt.Color(230, 230, 230));

 
        tblMahasiswa.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tblMahasiswa.setSelectionForeground(java.awt.Color.BLACK);


        jScrollPane1.getViewport().setBackground(java.awt.Color.WHITE);
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 182, 193), 1));


        tblMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMahasiswaMouseClicked(evt);
            }
        });

        cmbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungLive();
            }
        });

        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNama = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblNama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblNim1 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        lblTahunMasuk = new javax.swing.JLabel();
        txtTahunMasuk = new javax.swing.JTextField();
        UploadCsv = new javax.swing.JButton();
        cmbJenis = new javax.swing.JComboBox<>();
        txtSks = new javax.swing.JTextField();
        txtBiaya = new javax.swing.JTextField();
        lblJenisMhs = new javax.swing.JLabel();
        lblJenisMhs1 = new javax.swing.JLabel();
        lblJenisMhs2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        btnSubmit.setBackground(new java.awt.Color(255, 204, 255));
        btnSubmit.setText("Tambah");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblNama.setText("Nama");

        tblMahasiswa.setBackground(new java.awt.Color(255, 204, 255));
        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tblMahasiswa);

        btnHapus.setBackground(new java.awt.Color(255, 204, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 204, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblNim1.setText("NIM");

        lblTahunMasuk.setText("Tahun Masuk");

        txtTahunMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunMasukActionPerformed(evt);
            }
        });

        UploadCsv.setBackground(new java.awt.Color(255, 204, 255));
        UploadCsv.setText("Upload CSV");
        UploadCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadCsvActionPerformed(evt);
            }
        });

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reguler", "Beasiswa", "Internasional" }));

        txtSks.setActionCommand("<Not Set>");
        txtSks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSksActionPerformed(evt);
            }
        });
        txtSks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSksKeyReleased(evt);
            }
        });

        txtBiaya.setEditable(false);
        txtBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBiayaActionPerformed(evt);
            }
        });

        lblJenisMhs.setText("Jenis Mahasiswa");

        lblJenisMhs1.setText("Jumlah SKS");

        lblJenisMhs2.setText("Biaya Kuliah");

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel1.setText("Form Data Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTahunMasuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNim1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTahunMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UploadCsv)
                            .addComponent(lblJenisMhs2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJenisMhs1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJenisMhs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtSks, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbJenis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnSubmit)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTahunMasuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNama)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNim1)
                            .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(lblTahunMasuk)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenisMhs)
                    .addComponent(cmbJenis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJenisMhs1)
                    .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJenisMhs2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadCsv)
                    .addComponent(btnSubmit)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try {
            // --- 1. AMBIL DATA DARI FORM ---
            // Kita pakai .trim() untuk menghapus spasi di depan/belakang yang sering bikin error
            String nama = txtNama.getText().trim();
            String nim = txtNim.getText().trim();
            String jenis = cmbJenis.getSelectedItem().toString();

            // Cek jika ada yang kosong
            if (nama.isEmpty() || nim.isEmpty() || txtTahunMasuk.getText().isEmpty() || txtSks.getText().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Semua field (kecuali biaya) harus diisi!");
                return;
            }

            // Parse Angka (Bagian ini yang tadi error)
            int tahun = Integer.parseInt(txtTahunMasuk.getText().trim());
            int sks = Integer.parseInt(txtSks.getText().trim());

            // --- 2. PENERAPAN POLYMORPHISM (Inti Tugas Dosen) ---
            // Membuat object kosong dulu dari kelas Induk
            Mahasiswa mhs = null;

            // Cek pilihan dropdown, lalu buat object sesuai Cetakan (Class)-nya
            switch (jenis) {
                case "Reguler":
                    mhs = new MahasiswaReguler(nama, nim, tahun, sks);
                    break;
                case "Beasiswa":
                    mhs = new MahasiswaBeasiswa(nama, nim, tahun, sks);
                    break;
                case "Internasional":
                    mhs = new MahasiswaInternasional(nama, nim, tahun, sks);
                    break;
            }

            // --- 3. PROSES HITUNG & TAMPILKAN ---
            if (mhs != null) {
                // Polymorphism bekerja disini: method hitungBiayaKuliah() akan beda-beda rumusnya
                // tergantung object apa yang dibuat di atas.
                mhs.hitungBiayaKuliah();

                // A. TAMPILKAN HASIL KE LAYAR 
                // Format angka biar ada Rp dan titiknya (estetik)
                java.text.NumberFormat kursIDR = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("id", "ID"));
                txtBiaya.setText(kursIDR.format(mhs.getBiaya()));

                // B. SIMPAN KE DATABASE
                MahasiswaObject dao = new MahasiswaObject();
                dao.insert(mhs);

                // C. BERSIHKAN FORM & REFRESH TABEL
                loadData();

                javax.swing.JOptionPane.showMessageDialog(this, "Data berhasil disimpan! Biaya: " + kursIDR.format(mhs.getBiaya()));
            }

        } catch (NumberFormatException e) {
            // Error ini muncul jika user mengetik huruf di kolom SKS/Tahun
            javax.swing.JOptionPane.showMessageDialog(this, "SKS dan Tahun Masuk harus berupa angka murni! Cek spasi.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed

        // 1. Cek apakah ada baris yang dipilih
        int row = tblMahasiswa.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang mau dihapus dulu!");
            return;
        }

        // 2. Tambahkan Konfirmasi "Yakin Hapus?" (Supaya tidak kepencet)
        int jawab = JOptionPane.showConfirmDialog(this,
                "Apakah Anda yakin ingin menghapus data ini?",
                "Konfirmasi Hapus",
                JOptionPane.YES_NO_OPTION);

        if (jawab == JOptionPane.YES_OPTION) {
            try {
                // 3. Ambil ID dengan cara AMAN (Parse String ke Int)
                // Menggunakan .toString() lalu parseInt lebih aman daripada casting (int) langsung
                String idStr = tblMahasiswa.getValueAt(row, 0).toString();
                int id = Integer.parseInt(idStr);

                // 4. Hapus dari Database
                Connection conn = DbConnection.connect();
                String sql = "DELETE FROM mahasiswa WHERE id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
                conn.close();

                // 5. Refresh Tabel
                loadData();

                txtNama.setText("");
                txtNim.setText("");
                txtTahunMasuk.setText("");
                txtSks.setText("");
                txtBiaya.setText("");
                cmbJenis.setSelectedIndex(0);

                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal menghapus: " + e.getMessage());
            }
        }


    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // 1. Cek baris terpilih
        int row = tblMahasiswa.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris tabel dulu!");
            return;
        }

        try {
            // 2. Ambil ID (Primary Key) dari tabel
            int id = Integer.parseInt(tblMahasiswa.getValueAt(row, 0).toString());

            // 3. Ambil Data Baru dari Form
            String nama = txtNama.getText();
            String nim = txtNim.getText();
            int tahun = Integer.parseInt(txtTahunMasuk.getText());
            int sks = Integer.parseInt(txtSks.getText());
            String jenis = cmbJenis.getSelectedItem().toString();

            // 4. TERAPKAN POLYMORPHISM (Hitung Ulang Biaya)
            Mahasiswa mhs = null;
            switch (jenis) {
                case "Reguler":
                    mhs = new MahasiswaReguler(id, nama, nim, tahun, sks);
                    break;
                case "Beasiswa":
                    mhs = new MahasiswaBeasiswa(id, nama, nim, tahun, sks);
                    break;
                case "Internasional":
                    mhs = new MahasiswaInternasional(id, nama, nim, tahun, sks);
                    break;
            }

            if (mhs != null) {
                mhs.hitungBiayaKuliah(); // Rumus dijalankan

                // 5. Update Database
                // Pastikan class MahasiswaObject punya method update yang menerima object Mahasiswa
                MahasiswaObject dao = new MahasiswaObject();
                dao.update(mhs);

                // 6. Refresh
                loadData();
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");

                // Reset form
                txtNama.setText("");
                txtNim.setText("");
                txtTahunMasuk.setText("");
                txtSks.setText("");
                txtBiaya.setText("");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "SKS/Tahun harus angka!");
        } catch (Exception e) {
            System.out.println("Error Edit: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtTahunMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunMasukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTahunMasukActionPerformed

    private void UploadCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadCsvActionPerformed

        javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
        int result = fc.showOpenDialog(this);

        if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
            String file = fc.getSelectedFile().getAbsolutePath();
            importCsv(file);
        }

    }//GEN-LAST:event_UploadCsvActionPerformed

    private void txtSksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSksActionPerformed

    private void txtBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiayaActionPerformed

    private void txtSksKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSksKeyReleased
        hitungLive();
    }//GEN-LAST:event_txtSksKeyReleased

    private void insert() {
        try {
            Connection conn = DbConnection.connect();

            if (conn == null) {
                System.out.println("Koneksi gagal!");
                return;
            }

            String sql = "INSERT INTO mahasiswa (nim, nama, tahunmasuk) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtNim.getText());
            ps.setString(2, txtNama.getText());
            ps.setInt(3, Integer.parseInt(txtTahunMasuk.getText()));

            ps.executeUpdate();
            conn.close();

            loadData();
            System.out.println("✅ Data berhasil disimpan ke database!");

        } catch (Exception e) {
            System.out.println("Insert error: " + e.getMessage());
        }

    }

    private void importCsv(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean skipHeader = true; // Kita lewati baris judul

            Connection conn = DbConnection.connect();

            // QUERY INSERT LENGKAP (Termasuk Jenis & Biaya)
            String sql = "INSERT INTO mahasiswa (nim, nama, tahunmasuk, jenis_mahasiswa, jumlah_sks, biaya_kuliah) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            while ((line = br.readLine()) != null) {
                // Cek header
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }

                // Pecah koma
                String[] data = line.split(",");

                if (data.length < 5) {
                    System.out.println("Baris tidak lengkap dilewati: " + line);
                    continue;
                }

                // 1. Ambil Data Mentah dari CSV
                String nim = data[0].trim();
                String nama = data[1].trim();
                int tahun = Integer.parseInt(data[2].trim());
                String jenis = data[3].trim(); // Reguler/Beasiswa/Internasional
                int sks = Integer.parseInt(data[4].trim());

                // 2. HITUNG BIAYA OTOMATIS (Polymorphism Logic)
                Mahasiswa mhs = null;

                // Cek tulisan di CSV (Huruf besar/kecil tidak masalah karena equalsIgnoreCase)
                if (jenis.equalsIgnoreCase("Reguler")) {
                    mhs = new MahasiswaReguler(nama, nim, tahun, sks);
                } else if (jenis.equalsIgnoreCase("Beasiswa")) {
                    mhs = new MahasiswaBeasiswa(nama, nim, tahun, sks);
                } else if (jenis.equalsIgnoreCase("Internasional")) {
                    mhs = new MahasiswaInternasional(nama, nim, tahun, sks);
                } else {
                    // Jika salah ketik jenis, default ke Reguler
                    mhs = new MahasiswaReguler(nama, nim, tahun, sks);
                }

                // Jalankan rumus hitung
                mhs.hitungBiayaKuliah();
                double biayaJadi = mhs.getBiaya();

                // 3. MASUKKAN KE DATABASE
                ps.setString(1, nim);
                ps.setString(2, nama);
                ps.setInt(3, tahun);
                ps.setString(4, jenis); // Masukkan Jenis ke DB
                ps.setInt(5, sks);      // Masukkan SKS ke DB
                ps.setDouble(6, biayaJadi); // Masukkan Biaya Hasil Hitungan ke DB

                ps.executeUpdate();
            }

            conn.close();
            loadData(); // Refresh Tabel biar data muncul
            JOptionPane.showMessageDialog(this, "Import Berhasil! Data & Biaya sudah terisi.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal Import: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void loadData() {
        try {
            Connection conn = DbConnection.connect();
            Statement st = conn.createStatement();

            // Format Rupiah untuk Tabel
            NumberFormat kursIDR = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

            // Reset ID Sequence jika kosong (Opsional)
            ResultSet rsCount = st.executeQuery("SELECT COUNT(*) FROM mahasiswa");
            if (rsCount.next() && rsCount.getInt(1) == 0) {
                // Reset sequence logic here if needed
            }

            // Ambil Data
            ResultSet rs = st.executeQuery("SELECT * FROM mahasiswa ORDER BY id ASC");
            modelMahasiswa.setRowCount(0); // Kosongkan tabel dulu

            while (rs.next()) {
                // Konversi Double ke Format Rupiah String
                double biayaMentah = rs.getDouble("biaya_kuliah");
                String biayaCantik = kursIDR.format(biayaMentah);

                Object[] row = {
                    rs.getInt("id"),
                    rs.getString("nim"),
                    rs.getString("nama"),
                    rs.getInt("tahunmasuk"),
                    rs.getString("jenis_mahasiswa"),
                    rs.getInt("jumlah_sks"),
                    biayaCantik // Masukkan yang sudah diformat
                };
                modelMahasiswa.addRow(row);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Error Load Data: " + e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // --- METHOD TAMBAHAN UNTUK HITUNG REAL-TIME ---
    private void hitungLive() {
        try {
            // 1. Ambil teks SKS. Jika kosong, set Rp 0 dan berhenti.
            String sksText = txtSks.getText().trim();
            if (sksText.isEmpty()) {
                txtBiaya.setText("Rp 0,00");
                return;
            }

            // 2. Ubah SKS ke angka (Handle error jika user mengetik huruf)
            int sks = Integer.parseInt(sksText);

            // 3. Ambil Jenis Mahasiswa
            String jenis = cmbJenis.getSelectedItem().toString();

            // 4. Hitung Biaya (Polymorphism)
            Mahasiswa mhs = null;

            switch (jenis) {
                case "Reguler":
                    mhs = new MahasiswaReguler("-", "-", 0, sks);
                    break;
                case "Beasiswa":
                    mhs = new MahasiswaBeasiswa("-", "-", 0, sks);
                    break;
                case "Internasional":
                    mhs = new MahasiswaInternasional("-", "-", 0, sks);
                    break;
            }

            if (mhs != null) {
                mhs.hitungBiayaKuliah();

                // --- BAGIAN FORMAT RUPIAH (Rp xxx.xxx,xx) ---
                java.text.DecimalFormat kursIndonesia = (java.text.DecimalFormat) java.text.DecimalFormat.getCurrencyInstance();
                java.text.DecimalFormatSymbols formatRp = new java.text.DecimalFormatSymbols();

                formatRp.setCurrencySymbol("Rp "); // Ada spasi setelah Rp
                formatRp.setMonetaryDecimalSeparator(',');
                formatRp.setGroupingSeparator('.');

                kursIndonesia.setDecimalFormatSymbols(formatRp);

                // Tampilkan hasil ke Text Field
                txtBiaya.setText(kursIndonesia.format(mhs.getBiaya()));
            }

        } catch (NumberFormatException e) {
            // Jika user ngetik huruf, biarkan saja (jangan error)
            // txtBiaya.setText("Rp 0,00"); 
        } catch (Exception e) {
            System.out.println("Error hitung: " + e.getMessage());
        }
    }

    private void tblMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {
        // 1. Ambil baris yang diklik
        int row = tblMahasiswa.getSelectedRow();

        // Pastikan baris valid (bukan -1)
        if (row != -1) {

            // --- DATA TEKS (NIM, NAMA, TAHUN) ---
            // Kita pakai Helper Logika: (Jika null, ganti jadi text kosong "")
            // Agar tidak error NullPointerException
            Object nimObj = tblMahasiswa.getValueAt(row, 1);
            Object namaObj = tblMahasiswa.getValueAt(row, 2);
            Object tahunObj = tblMahasiswa.getValueAt(row, 3);
            Object jenisObj = tblMahasiswa.getValueAt(row, 4);
            Object sksObj = tblMahasiswa.getValueAt(row, 5);

            // Masukkan ke Text Field dengan pengecekan aman
            txtNim.setText(nimObj != null ? nimObj.toString() : "");
            txtNama.setText(namaObj != null ? namaObj.toString() : "");
            txtTahunMasuk.setText(tahunObj != null ? tahunObj.toString() : "");

            // --- DROPDOWN (JENIS) ---
            if (jenisObj != null) {
                cmbJenis.setSelectedItem(jenisObj.toString());
            } else {
                cmbJenis.setSelectedIndex(0); // Default jika kosong
            }

            // --- SKS & HITUNG BIAYA ---
            if (sksObj != null) {
                txtSks.setText(sksObj.toString());
            } else {
                txtSks.setText("0");
            }

            // Panggil hitungLive agar format Rupiah muncul
            hitungLive();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UploadCsv;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJenisMhs;
    private javax.swing.JLabel lblJenisMhs1;
    private javax.swing.JLabel lblJenisMhs2;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNim1;
    private javax.swing.JLabel lblTahunMasuk;
    private javax.swing.JTable tblMahasiswa;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtSks;
    private javax.swing.JTextField txtTahunMasuk;
    // End of variables declaration//GEN-END:variables

}

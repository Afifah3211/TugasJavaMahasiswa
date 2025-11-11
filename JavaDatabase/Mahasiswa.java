/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

import java.sql.Connection;

/**
 *
 * @author Ahmad Yusuf
 */
public class Mahasiswa {
    int id;
    String nim;
    String nama;
    
    int tahunMasuk;
    Connection con;
    
    Mahasiswa(int id, String nim, String nama, int tahunMasuk){
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        
        con = DbConnection.connect();
    }
    
    Mahasiswa(String nim, String nama, int tahunMasuk){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;
    
    // Konstruktor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
        
    }
    //getter dan setter
    public String getNama () {
        return nama;
    }
    public void setNama (String nama) {
        this.nama = nama;
    }
    public int getKecepatan () {
        return kecepatanMaks;
    }
    public void setKecepatan (int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }
    public String getMesin () {
        return jenisMesin;
    }
    public void setKecepatan (String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }
    // Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfo () {
        System.out.println("Nama Kendaraan      :" + nama);
        System.out.println("Kecepatan Maksimum  :" + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin         :" + jenisMesin);
    }    
}

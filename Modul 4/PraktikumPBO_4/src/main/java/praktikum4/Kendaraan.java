/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    private String merek;
    private String model;
    private int tahun;
    private String nama;            // Hanya bisa diakses dalam kelas ini
    protected int kecepatanMaks;    // Bisa diakses di package yang sama dan subclass
    public String jenisMesin;      // Bisa diakses dari mana saja
    
    // Konstruktor
    public Kendaraan(String merek, String model, int tahun, String nama, int kecepatanMaks, String jenisMesin) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
        
    }
    // Getter dan Setter untuk merek
    public String getMerek() {
        return merek;
    }
    public void setMerek (String merek) {
        this.merek = merek;
    }
    // Getter dan Setter untuk model
    public String getModel() {
        return model;
    }
    public void setModel (String model) {
        this.model = model;
    }
    // Getter dan Setter untuk tahun
    public int getTahun () {
        return tahun;
    }
    public void setTahun (int tahun) {
        this.tahun = tahun;
    }
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
    public void tampilkanInfoKendaraan () {
        System.out.println("Nama Kendaraan      :" + nama);
        System.out.println("Kecepatan Maksimum  :" + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin         :" + jenisMesin);
    }    
}
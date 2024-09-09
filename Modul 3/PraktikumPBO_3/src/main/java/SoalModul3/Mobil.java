/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalModul3;

/**
 *
 * @author ASUS
 */
public class Mobil {
    private String Merk;
    private String Model;
    private int Tahun;
    private String Warna;
    
    public Mobil(String Merk, String Model, int Tahun, String Warna) {
        this.Merk = Merk;
        this.Model = Model;
        this.Tahun = Tahun;
        this.Warna = Warna;
    }
    public String getMerk() {
        return Merk;
    }
    public void setMerk(String Merk) {
        this.Merk = Merk;
    }
    public String getModel() {
        return Model;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }
    public int getTahun() {
        return Tahun;
    }
    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }
    public String getWarna() {
        return Warna;
    }
    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    void displayInfo() {
        System.out.println("Merk mobil  : " + getMerk());
        System.out.println("Model       : " + getModel());
        System.out.println("Tahun       : " + getTahun());
        System.out.println("Warna       : " + getWarna());
    }
    void startEngine() {
        System.out.println("Mesin mobil menyala");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul6;

/**
 *
 * @author ASUS
 */
abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Metode abstrak untuk menghitung diskon
    public abstract double hitungDiskon();
    
    // Getter untuk mendapatkan harga setelah diskon
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
}
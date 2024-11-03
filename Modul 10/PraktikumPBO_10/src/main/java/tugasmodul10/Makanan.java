/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasmodul10;

/**
 *
 * @author pc
 */
class Makanan implements Pembayaran {
    private String nama;
    private double harga;
    
    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05; // Pajak 5%
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
}